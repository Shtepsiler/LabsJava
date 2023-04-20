import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
 class NotebookApp {

    private TreeSet<String> contacts = new TreeSet<>();
    private JFrame frame;
    private JTextField surnameField, phoneField;
    private JLabel countLabel;
    private JTextArea outputArea;

    public NotebookApp() {
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Notebook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.add(new JLabel("Surname:"));
        surnameField = new JTextField();
        topPanel.add(surnameField);
        topPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        topPanel.add(phoneField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String surname = surnameField.getText().trim();
                String phone = phoneField.getText().trim();
                if (!surname.isEmpty() && !phone.isEmpty()) {
                    contacts.add(surname + ": " + phone);
                    updateCount();
                    surnameField.setText("");
                    phoneField.setText("");
                }
            }
        });
        topPanel.add(addButton);

        JButton printButton = new JButton("Print");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String contact : contacts) {
                    sb.append(contact).append("\n");
                }
                outputArea.setText(sb.toString());
            }
        });
        topPanel.add(printButton);

        countLabel = new JLabel("Contacts: 0");
        topPanel.add(countLabel);

        frame.add(topPanel, BorderLayout.NORTH);

        outputArea = new JTextArea();
        frame.add(outputArea, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private void updateCount() {
        countLabel.setText("Contacts: " + contacts.size());
    }

    public static void main(String[] args) {
        new NotebookApp();
    }
}
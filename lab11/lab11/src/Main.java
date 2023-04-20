import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 class FunctionTable extends JFrame {
    private static final long serialVersionUID = 1L;

    private JTextField aTextField, xTextField, nTextField;
    private JTextArea resultTextArea;
    private JButton calculateButton;

    public FunctionTable() {
        super("Function Table");

        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input"));
        JLabel aLabel = new JLabel("A:");
        aTextField = new JTextField(10);
        JLabel xLabel = new JLabel("X:");
        xTextField = new JTextField(10);
        JLabel nLabel = new JLabel("N:");
        nTextField = new JTextField(10);
        inputPanel.add(aLabel);
        inputPanel.add(aTextField);
        inputPanel.add(xLabel);
        inputPanel.add(xTextField);
        inputPanel.add(nLabel);
        inputPanel.add(nTextField);

        // Create result panel
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Result"));
        resultTextArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        buttonPanel.add(calculateButton);

        // Add panels to main content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(resultPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculate() {
        double a = Double.parseDouble(aTextField.getText());
        double x = Double.parseDouble(xTextField.getText());
        int n = Integer.parseInt(nTextField.getText());

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s%-10s\n", "X", "Y"));

        for (int i = 0; i < n; i++) {
            double y = a * Math.sqrt(x) * Math.sin(a * x);
            sb.append(String.format("%-10.2f%-10.2f\n", x, y));
            x += 1.0;
        }

        resultTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        new FunctionTable();
    }
}
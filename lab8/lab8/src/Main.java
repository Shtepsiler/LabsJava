import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class LoginWindow extends JFrame {
    private JLabel inLabel, outLabel;
    private JTextField inField, outField;
    private JButton copyButton, prarrButton;

    public LoginWindow() {
        ArrayList<String> listofinners = new ArrayList<>();


        // Налаштування параметрів вікна
        setTitle("Авторизація");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Створення елементів і їх розміщення на вікні
        inLabel = new JLabel("поле вводу:");
        inField = new JTextField(20);
        outLabel = new JLabel("поле виводу:");
        outField = new JTextField(20);
        copyButton = new JButton("Скопіювати");
        prarrButton = new JButton("Друкувати");


        JPanel panel = new JPanel(new GridBagLayout()); // використання GridBagLayout для настройки компонентів

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5); // змінено розмір відступів
        panel.add(inLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2; // об'єднання двох клітинок по горизонталі
        panel.add(inField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(outLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(outField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.LINE_END;
        panel.add(copyButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.LINE_END;
        panel.add(prarrButton, constraints);

        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отримання тексту з текстового поля і збереження його в локальну змінну
                String text = inField.getText();
                outField.setText(text);
                listofinners.add(text);
            }
        });
        prarrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(String inner : listofinners)
                System.out.println(inner);
            }
        });

        add(panel);

        // Відображення вікна
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
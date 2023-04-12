import javax.swing.*;
import java.awt.*;

 class LoginWindow extends JFrame {
    private JLabel loginLabel, passwordLabel;
    private JTextField loginField, passwordField;
    private JButton okButton, cancelButton;

    public LoginWindow() {
        // Налаштування параметрів вікна
        setTitle("Вххід у вікно");
        setSize(400, 200); // змінено розмір вікна
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Створення елементів і їх розміщення на вікні
        loginLabel = new JLabel("Логін:");
        loginLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // змінено розмір шрифту
        loginField = new JTextField(30); // змінено розмір поля
        passwordLabel = new JLabel("Пароль:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // змінено розмір шрифту
        passwordField = new JPasswordField(30); // змінено розмір поля
        okButton = new JButton("ОК");
        okButton.setPreferredSize(new Dimension(80, 30)); // змінено розмір кнопки
        cancelButton = new JButton("Відміна");
        cancelButton.setPreferredSize(new Dimension(80, 30)); // змінено розмір кнопки

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10)); // змінено розмір міжелементних відстаней
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // змінено розмір відступів
        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(okButton);
        panel.add(cancelButton);
        add(panel);

        // Відображення вікна
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
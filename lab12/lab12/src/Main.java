import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class TestsProgram extends JFrame {
    private JLabel questionLabel;
    private ButtonGroup optionsGroup;
    private JRadioButton[] options;
    private JButton nextButton;
    private int currentQuestion;
    private ArrayList<Integer> scores;

    private String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "Who painted the Mona Lisa?",
            "What is the currency of Japan?",
            "What is the tallest mammal?"
    };

    private String[][] answerOptions = {
            {"London", "Paris", "Madrid", "Rome"},
            {"Mars", "Venus", "Jupiter", "Saturn"},
            {"Pablo Picasso", "Leonardo da Vinci", "Michelangelo", "Vincent van Gogh"},
            {"Dollar", "Yen", "Euro", "Pound"},
            {"Elephant", "Giraffe", "Horse", "Lion"}
    };

    private int[] correctAnswers = {1, 3, 2, 1, 1}; // Index of correct answer for each question

    public TestsProgram() {
        super("Tests Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        currentQuestion = 0;
        scores = new ArrayList<>();

        // Create UI components
        questionLabel = new JLabel(questions[currentQuestion]);
        optionsGroup = new ButtonGroup();
        options = new JRadioButton[4];
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton(answerOptions[currentQuestion][i]);
            optionsGroup.add(options[i]);
        }
        nextButton = new JButton("Next");

        // Add UI components to content pane
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel(new GridLayout(0, 1));
        questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        questionPanel.add(questionLabel);
        for (int i = 0; i < options.length; i++) {
            questionPanel.add(options[i]);
        }
        container.add(questionPanel, BorderLayout.CENTER);
        container.add(nextButton, BorderLayout.SOUTH);

        // Add event listeners
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = -1;
                for (int i = 0; i < options.length; i++) {
                    if (options[i].isSelected()) {
                        selected = i;
                        break;
                    }
                }
                if (selected == correctAnswers[currentQuestion]) {
                    scores.add(5);
                } else {
                    scores.add(2);
                }

                if (currentQuestion < questions.length - 1) {
                    currentQuestion++;
                    questionLabel.setText(questions[currentQuestion]);
                    for (int i = 0; i < options.length; i++) {
                        options[i].setText(answerOptions[currentQuestion][i]);
                        options[i].setSelected(false);
                    }
                } else {
                    int totalScore = 0;
                    for (int score : scores) {
                        totalScore += score;
                    }
                    double averageScore = (double) totalScore / scores.size();
                    JOptionPane.showMessageDialog(TestsProgram.this, "Test completed. Average score: " + averageScore);
                    dispose();
                }
            }
        });

        setVisible(true);
    }



    public static void main(String[] args) {
        new TestsProgram();
    }
}


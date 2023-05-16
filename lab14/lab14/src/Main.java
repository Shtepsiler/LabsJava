import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

 class FileParsingExample {
    public static void main(String[] args) {
        try {
            // Відкриття файлу для читання
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;

            // Зчитування рядків з файлу
            while ((line = reader.readLine()) != null) {
                System.out.println("Введений рядок: " + line);
                System.out.print("Рядок складається з: ");

                // Розбиття рядка на слова за допомогою StringTokenizer
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();

                    try {
                        // Перетворення слова в число
                        double number = Double.parseDouble(word);
                        System.out.println(word + " - це число = " + number);
                    } catch (NumberFormatException e) {
                        // Якщо не вдається перетворити в число, ігноруємо слово
                    }
                }
            }

            // Закриття файлу
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдений");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

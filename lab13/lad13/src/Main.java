import java.util.*;
import java.io.*;

 class InputTest {
    public static void main(String args[]) {
        if(args.length < 2) {
            System.out.println("Введіть назву файлу та рядок");
            return;
        }

        String thisLine;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader fin = null;
        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            while ((thisLine = fin.readLine()) != null) {
                System.out.println("==:"+thisLine);
                list.add(thisLine);
            }
            Collections.sort(list);
            System.out.println("Відсортований мписсок рядків:");
            Iterator<String> iter = list.iterator();
            while( iter.hasNext() ) {
                String str = iter.next();
                System.out.println(str);
            }

            String searchString = args[1];
            int index = Collections.binarySearch(list, searchString);
            System.out.println("Пошук по рядку : " + args[1]);
            if(index >= 0) {
                System.out.println("Результат пошуку: рядок знайдений на позиції " + index);
            } else {
                System.out.println("Результат пошуку: рядок не знайдений ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не існує: " + args[0]);
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Помилка вводу/виводу. Файл " + args[0]);
            System.out.println("Error: " + e);
        } finally {
            if ( fin != null )
                try {
                    fin.close(); // !!! Закрыть файл
                } catch ( IOException ex ) {
                    System.out.println("Помилка закриття файлу " + args[0]);
                    System.out.println("Error: " + ex);
                }
            fin = null;
        }
    }
}
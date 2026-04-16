import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        // Сначала создадим файл для чтения
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            fos.write("Hello Dima and Katya".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Читаем файл через InputStream
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            // read() возвращает -1 когда достигнут конец файла
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // выводим как символ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
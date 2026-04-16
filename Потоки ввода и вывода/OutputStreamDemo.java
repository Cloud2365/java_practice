import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        // Записываем данные в файл
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Racoon and beaver!";
            for (char c : text.toCharArray()) {
                fos.write((int) c);  // write(int) — записывает один байт
            }
            System.out.println("Данные записаны");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
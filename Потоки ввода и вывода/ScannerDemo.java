import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        
        // 1. Создаём файл с текстом
        try (PrintWriter writer = new PrintWriter("message.txt")) {
            writer.println("Привет, сегодня замечательная погода!");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 2. Читаем файл
        try (Scanner scanner = new Scanner(new File("message.txt"))) {
            String line = scanner.nextLine();  
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
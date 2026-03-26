import java.util.Date;

public class FormatterDemo {
    public static void main(String[] args) {
        
        System.out.println("=== ФОРМАТИРОВАНИЕ СТРОК ===\n");
        
        // 1. %s - строка
        String name = "Анна";
        int age = 25;
        System.out.printf("1. %s: возраст %d лет%n", name, age);
        
        // 2. %d - целое число
        System.out.printf("2. Число: %d%n", 12345);
        
        // 3. %f - дробное число (с 2 знаками)
        double price = 99.99;
        System.out.printf("3. Цена: %.2f руб.%n", price);
        
        // 4. %b - логическое значение
        System.out.printf("4. Статус: %b%n", true);
        
        // 5. %% - знак процента
        System.out.printf("5. Скидка 50%%%n");
        
        System.out.println("\n=== ФОРМАТИРОВАНИЕ ДАТЫ ===\n");
        
        Date now = new Date();
        
        // 1. %tH - час (00-23)
        System.out.printf("1. Час: %tH%n", now);
        
        // 2. %tM - минуты
        System.out.printf("2. Минуты: %tM%n", now);
        
        // 3. %tS - секунды
        System.out.printf("3. Секунды: %tS%n", now);
        
        // 4. %tY - год (4 цифры)
        System.out.printf("4. Год: %tY%n", now);
        
        // 5. %tB - полное название месяца
        System.out.printf("5. Месяц: %tB%n", now);
        
        // Сегодняшняя дата
        System.out.printf("Дата: %1$td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS%n", now);
    }
}
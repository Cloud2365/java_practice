import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        
        System.out.println("=== STRINGJOINER ===\n");
        
        // 1. Простое объединение с разделителем
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println("1. " + joiner1);  // Яблоко, Банан, Апельсин
        
        // 2. С префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Понедельник");
        joiner2.add("Вторник");
        joiner2.add("Среда");
        System.out.println("2. " + joiner2);  // [Понедельник, Вторник, Среда]
        
        // 3. Пустой результат
        StringJoiner joiner3 = new StringJoiner(", ");
        System.out.println("3. Пустой: '" + joiner3 + "'");  // ''
        
        // 4. С установкой значения по умолчанию для пустого
        StringJoiner joiner4 = new StringJoiner(", ", "[", "]");
        joiner4.setEmptyValue("Пусто");
        System.out.println("4. Пустой с default: '" + joiner4 + "'");  // Пусто
        
        // 5. Добавление после установки default
        joiner4.add("Элемент");
        System.out.println("5. После добавления: " + joiner4);  // [Элемент]
        
        // 6. Объединение двух StringJoiner
        StringJoiner fruits = new StringJoiner(", ");
        fruits.add("Яблоко");
        fruits.add("Груша");
        
        StringJoiner berries = new StringJoiner(", ");
        berries.add("Клубника");
        berries.add("Малина");
        
        fruits.merge(berries);
        System.out.println("6. После merge: " + fruits);  // Яблоко, Груша, Клубника, Малина
        
       
        // 8. Альтернатива с коллекциями
        System.out.println("\n=== СРАВНЕНИЕ С String.join() ===");
        
        String[] names = {"Анна", "Мария", "Елена"};
        String joined = String.join(", ", names);
        System.out.println("String.join(): " + joined);

        
        StringJoiner joiner = new StringJoiner(", ", "Список: [", "]");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println("StringJoiner: " + joiner);
    }
}
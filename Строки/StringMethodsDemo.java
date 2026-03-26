public class StringMethodsDemo {
    public static void main(String[] args) {
        
        String str = "  Java Programming Language  ";
        String str2 = "Java";
        
        System.out.println("=== 10 МЕТОДОВ КЛАССА STRING ===\n");
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());  // 29
        
        // 2. charAt() - возвращает символ по индексу 
        System.out.println("2. charAt(2): '" + str.charAt(2) + "'");  // 'J'
        
        // 3. substring() - извлекает подстроку (начало, конец не включается)
        System.out.println("3. substring(2, 6): '" + str.substring(2, 6) + "'");  // "Java"
        
        // 4. trim() - удаляет пробелы в начале и конце
        System.out.println("4. trim(): '" + str.trim() + "'");
        
        // 5. toUpperCase() / toLowerCase() - изменение регистра
        System.out.println("5. toUpperCase(): " + str.toUpperCase());
        System.out.println("   toLowerCase(): " + str.toLowerCase());
        
        // 6. equals() / equalsIgnoreCase() - сравнение строк
        System.out.println("6. equals(\"Java\"): " + str2.equals("Java"));           // true
        System.out.println("   equalsIgnoreCase(\"java\"): " + str2.equalsIgnoreCase("java")); // true
        
        // 7. contains() - проверяет, содержит ли строку подстроку
        System.out.println("7. contains(\"Java\"): " + str.contains("Java"));        // true
        System.out.println("   contains(\"Python\"): " + str.contains("Python"));    // false
        
        // 8. indexOf() / lastIndexOf() - поиск индекса подстроки
        System.out.println("8. indexOf('a'): " + str.indexOf('a'));                  // 3
        System.out.println("   lastIndexOf('a'): " + str.lastIndexOf('a'));          // 24
        
        // 9. replace() / replaceAll() - замена символов/подстрок
        System.out.println("9. replace('a', 'o'): " + str.replace('a', 'o'));
        System.out.println("   replaceAll(\"Java\", \"Python\"): " + str.replaceAll("Java", "Python"));
        
        // 10. split() - разбивает строку на массив по разделителю
        String[] words = str.trim().split(" ");
        System.out.print("10. split(): ");
        for (String w : words) {
            System.out.print("[" + w + "] ");
        }
        System.out.println();
       
    }
}
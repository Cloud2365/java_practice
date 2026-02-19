/**
 * Примеры использования оператора instanceof
 * @author Хаймин Дмитрий
 * @version 1.0
 */
public class InstanceExample {
    public static void main(String[] args) {
        
        System.out.println("=== ПРИМЕРЫ ИСПОЛЬЗОВАНИЯ INSTANCEOF ===\n");
        
        // 1. Строка
        String text = "Привет";

        System.out.println("text instanceof String: " + (text instanceof String));  // true
        System.out.println("text instanceof Object: " + (text instanceof Object));  // true
        
        // 2. Число
        Integer number = 100;

        System.out.println("\nnumber instanceof Integer: " + (number instanceof Integer));  // true
        System.out.println("number instanceof Number: " + (number instanceof Number));      // true
        
        // 3. Массив
        int[] arr = {1, 2, 3};
        System.out.println("\narr instanceof int[]: " + (arr instanceof int[]));      // true
        System.out.println("arr instanceof Object: " + (arr instanceof Object));      // true
        
        // 4. null 
        String empty = null;
        System.out.println("\nnull instanceof String: " + (empty instanceof String));  // false
        System.out.println("null instanceof Object: " + (empty instanceof Object));      // false
        
       
    }
}
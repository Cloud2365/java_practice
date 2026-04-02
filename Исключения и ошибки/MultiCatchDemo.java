public class MultiCatchDemo {
    public static void main(String[] args) {
        
        System.out.println("=== НЕСКОЛЬКО CATCH ===\n");
        
        // 1. Исключения обрабатываются одинаково
        try {
            String str = null;
            str.length();  // NullPointerException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Обработано одинаково: " + e.getClass().getSimpleName());
        }
        
        // 2. Иерархия исключений (дочерние должны идти перед родительскими)
        try {
            int[] arr = new int[1];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Дочернее исключение (конкретное)");
        } catch (RuntimeException e) {
            System.out.println("Родительское исключение (общее)");
        }
    }
}
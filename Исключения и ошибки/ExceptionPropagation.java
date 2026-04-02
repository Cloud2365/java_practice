public class ExceptionPropagation {
    
    // Метод, который не перехватывает исключение (оно уходит выше)
    public static void methodWithoutCatch() {
        System.out.println("Вход в methodWithoutCatch");
        int[] arr = {1, 2, 3};
        // ArrayIndexOutOfBoundsException - не перехватывается
        int value = arr[5];  
        System.out.println("Эта строка не выполнится");
    }
    
    // Метод, который перехватывает исключение
    public static void methodWithCatch() {
        System.out.println("Вход в methodWithCatch");
        try {
            int result = 10 / 0;  // ArithmeticException
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        System.out.println("Метод methodWithCatch завершён нормально");
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПЕРЕХВАЧЕННОЕ ИСКЛЮЧЕНИЕ ===");
        methodWithCatch();  // исключение перехвачено, программа продолжает
        
        System.out.println("\n=== НЕПЕРЕХВАЧЕННОЕ ИСКЛЮЧЕНИЕ ===");
        methodWithoutCatch();  // исключение не перехвачено -> аварийная остановка
        
        System.out.println("Эта строка не выполнится (программа упадёт выше)");
    }
}
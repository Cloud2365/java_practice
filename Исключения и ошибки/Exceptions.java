public class Exceptions {
    public static void main(String[] args) {
        
        // 1. ArithmeticException
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        
        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1,2,3};
            int y = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне границ");
        }
        
        // 3. IllegalArgumentException (бросаем сами)
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // 4. ClassCastException
        try {
            Object obj = "123";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Неверное приведение типа");
        }
        
        // 5. NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Обращение к null");
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
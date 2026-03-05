public class InstanceOf {
    
    static class Box<T> {
        private T value;
        public Box(T value) { this.value = value; }
        public T getValue() { return value; }
    }
    
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Привет");
        Box<Integer> intBox = new Box<>(123);
        
        // так нельзя
        // if (stringBox instanceof Box<String>) { } // Ошибка
        
        
        if (stringBox instanceof Box) {
            System.out.println("Это Box");
        }
        
       
        if (stringBox instanceof Box<?>) {
            System.out.println("Это Box с каким-то типом");
        }
        

        if (stringBox.getValue() instanceof String) {
            System.out.println("Внутри stringBox: " + stringBox.getValue());
        }
        
        if (intBox.getValue() instanceof Integer) {
            System.out.println("Внутри intBox: " + intBox.getValue());
        }
    }
}
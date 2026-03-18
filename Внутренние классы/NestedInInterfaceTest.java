/**
 * Интерфейс с вложенным классом
 */
interface Vehicle {
    
    void start();  // обычный метод интерфейса
    
    // Вложенный класс внутри интерфейса
    class Helper {
        
        public static void printInfo() {
            System.out.println("Это вложенный класс в интерфейсе Vehicle");
        }
        
        public void showHelp() {
            System.out.println("Помощь по транспортным средствам");
        }
        
        public static final String DESCRIPTION = "Вспомогательный класс";
    }
    

}

/**
 * Реализация интерфейса
 */
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Машина заводится");
    }
}

public class NestedInInterfaceTest {
    public static void main(String[] args) {
        
        System.out.println("=== ВЛОЖЕННЫЙ КЛАСС В ИНТЕРФЕЙСЕ ===\n");
        
        // Вызов статического метода через имя интерфейса
        Vehicle.Helper.printInfo();  
        System.out.println("Описание: " + Vehicle.Helper.DESCRIPTION);
        // Создание объекта вложенного класса
        Vehicle.Helper helper = new Vehicle.Helper();
        helper.showHelp();  // вызов обычного метода
        
        // Доступ к полям
        System.out.println("\nДоступ к полю: " + helper.DESCRIPTION); 

        
        // Использование с реализацией интерфейса
        Car car = new Car();
        car.start();
    
    }
}
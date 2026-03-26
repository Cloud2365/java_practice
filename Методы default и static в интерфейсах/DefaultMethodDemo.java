// Интерфейс с default и static методами
interface Vehicle {
    
    // Абстрактный метод 
    void start();
    
    // Default метод (с реализацией)
    default void stop() {
        System.out.println("Транспорт останавливается");
    }
    
    // Static метод (принадлежит интерфейсу)
    static void info() {
        System.out.println("Это интерфейс Vehicle");
    }
    
    // Ещё один default метод
    default void honk() {
        System.out.println("Сигнал: Бип-бип!");
    }
}

// Класс, реализующий интерфейс
class Car implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Машина заводит двигатель");
    }
    
    // Переопределяем default метод 
    @Override
    public void honk() {
        System.out.println("Машина сигналит: БИИИП!");
    }
    
    // stop() не переопределяем — используем реализацию по умолчанию
}

// Другой класс
class Bicycle implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Велосипед начинает движение");
    }
    
    // Используем все default методы без изменений
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        
        System.out.println("=== СПОСОБЫ ВЫЗОВА ===\n");
        
        // 1. Вызов static метода через интерфейс
        Vehicle.info();  // через имя интерфейса
        
        // 2. Вызов методов через объект Car
        Car car = new Car();
        car.start();           // переопределённый
        car.stop();            // не переопределён
        car.honk();            // переопределённый 
        
        // 3. Вызов методов через объект Bicycle
        Bicycle bike = new Bicycle();
        bike.start();          // переопределённый
        bike.stop();           // default метод
        bike.honk();           // не переопределён
        
        // 4. Полиморфизм
        System.out.println("\n=== ПОЛИМОРФИЗМ ===");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();
        
        v1.start();  // Машина заводит двигатель
        v2.start();  // Велосипед начинает движение
        v1.stop();   // Транспорт останавливается (общий для всех)
    }
}
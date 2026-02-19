/**
 * Принцип подстановки Лисков - пример с машинами
 */
public class LiskovCars {
    
    // Базовый класс - Машина
    static class Car {
        public void startEngine() {
            System.out.println("Двигатель запущен");
        }
        
        public void drive() {
            System.out.println("Машина едет");
        }
    }
    
    // Класс-наследник - Грузовик 
    static class Truck extends Car {
        @Override
        public void drive() {
            System.out.println("Грузовик медленно едет с грузом");
        }
        
        // Специфичный метод грузовика
        public void loadCargo() {
            System.out.println("Груз загружен");
        }
    }
    
    // Метод, который работает с любой машиной
    public static void testCar(Car car) {
        car.startEngine();
        car.drive();
    }
    
    public static void main(String[] args) {
        
        Car simpleCar = new Car();
        Car truck = new Truck();  
        
        System.out.println("1. Обычная машина:");
        testCar(simpleCar); // Двигатель запущен
                            // Машина едет
        
        System.out.println("\n2. Грузовик (подставляет вместо машины):");
        testCar(truck);   // Двигатель запущен
                          // Грузовик медленно едет с грузом
        
        // Специфичный метод грузовика
        System.out.println("\n3. Специфичный метод грузовика:");
            Truck realTruck = (Truck) truck;
            realTruck.loadCargo(); // Груз загружен
        }
    }

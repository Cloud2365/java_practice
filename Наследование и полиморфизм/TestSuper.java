// Суперкласс
class Animal {
    String name = "Животное";
    
    Animal() {
        System.out.println("Конструктор Animal");
    }
    
    Animal(String type) {
        System.out.println("Конструктор Animal с параметром: " + type);
    }
    
    void sound() {
        System.out.println("Животное издаёт звук");
    }
}

// Подкласс
class Dog extends Animal {
    String name = "Собака";
    
    Dog() {
        super();  // 1) вызов конструктора суперкласса
        System.out.println("Конструктор Dog");
    }
    
    Dog(String breed) {
        super("Млекопитающее");  // 1️) вызов другого конструктора
        System.out.println("Порода: " + breed);
    }
    
    void printNames() {
        System.out.println("Имя из Dog: " + this.name);     // Собака
        System.out.println("Имя из Animal: " + super.name); // 2️) доступ к полю суперкласса
    }
    
    @Override 
    void sound() {
        System.out.println("Собака лает");
    }
    
    void makeSound() {
        this.sound();         // свой метод 
        super.sound();        // 3️) вызов метода суперкласса
    }
}

public class TestSuper {
    public static void main(String[] args) {
        System.out.println("=== Создание Dog() ===");
        Dog dog1 = new Dog(); //Конструктор Animal
                            // Конструктор Dog
        
        System.out.println("\n=== Создание Dog(\"Такса\") ===");
        Dog dog2 = new Dog("Такса"); //Конструктор Animal с параметром: Млекопитающее
                                            // Порода: Такса
        
        System.out.println("\n=== Демонстрация super ===");
        dog1.printNames();   //Имя из Dog: Собака
                             //Имя из Animal: Животное
        
        System.out.println("\n=== Вызов методов ===");
        dog1.makeSound(); //Собака лает
                          //Животное издаёт звук
    }
}
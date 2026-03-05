import java.util.ArrayList;
import java.util.List;
// Класс фрукты
class Fruit {
    String name;

    Fruit(String name) { 
        this.name = name; 
    }

    public String toString() {
    return name; 
    }

}
// Подкласс
class Apple extends Fruit {
    Apple() { super("Яблоко"); }
}
// Подкласс
class Banana extends Fruit {
    Banana() { super("Банан"); }
}

public class ExtendAndSuper {
    
    // <? extends Fruit> - можно только читать данные, только у самого класса или классов-наследников
    public static void printFruits(List<? extends Fruit> fruits) {
        System.out.println("Фрукты в корзине:");
        for (Fruit f : fruits) {           // можно читать
            System.out.println("  " + f);
        }
        // fruits.add(new Apple()); нельзя добавить!
    }
    
    // <? super Apple> - только добавляем, только у самого класса или классов-родителей
    public static void addApples(List<? super Apple> basket) {
        System.out.println("\nДобавляем яблоки:");
        basket.add(new Apple());        // можно добавить Apple
        basket.add(new Apple());        // можно добавить Apple
        // basket.add(new Banana());    // банан нельзя!
        
        // Apple a = basket.get(0); //  нельзя читать
    }
    
    public static void main(String[] args) {
        // Корзины с разными фруктами
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        
        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana());
        
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Banana());
        
        // Тестируем printFruits (<? extends Fruit>)
        System.out.println("--- printFruits ---");
        printFruits(apples);    //  список яблок
        printFruits(bananas);   //  список бананов
        printFruits(fruits);    // список фруктов
        
        // Тестируем addApples (<? super Apple>)
        System.out.println("\n--- addApples ---");
        List<Apple> appleBasket = new ArrayList<>();
        List<Fruit> fruitBasket = new ArrayList<>();
        List<Object> objectBasket = new ArrayList<>();
        
        addApples(appleBasket);  // можно
        addApples(fruitBasket);  // можно
        addApples(objectBasket); //  можно
        
        System.out.println("appleBasket: " + appleBasket); // [Яблоко, Яблоко]
        System.out.println("fruitBasket: " + fruitBasket); // [Яблоко, Яблоко]
        System.out.println("objectBasket: " + objectBasket); // [Яблоко, Яблоко]
    }
}
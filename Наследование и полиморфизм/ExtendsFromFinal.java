// final-класс 
final class FinalClass {
    private String name;
    
    public FinalClass(String name) {
        this.name = name;
    }
    
    public void showInfo() {
        System.out.println("Это final класс, имя: " + name);
    }
}

// Нельзя создать подкласс от final класса (The type ChildClass cannot subclass the final class FinalClass)
/* 
class ChildClass extends FinalClass {
    public ChildClass(String name) {
        super(name);
    }
}
    */

public class ExtendsFromFinal {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass("Тест");
        obj.showInfo(); 
    }
}
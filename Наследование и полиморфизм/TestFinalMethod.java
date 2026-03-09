
class Parent {
    
    // Обычный метод 
    public void normalMethod() {
        System.out.println("Обычный метод родителя");
    }
    
    // final-метод 
    public final void finalMethod() {
        System.out.println("FINAL метод родителя");
    }
}

class Child extends Parent {
    
    // Переопределение обычного метода
    @Override
    public void normalMethod() {
        System.out.println("Переопределённый метод в ребенке");
    }
    
    // Нельзя переопределить final-метод! (Cannot override the final method from Parent)
    /* 
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить final метод");
    }   
    */
}

public class TestFinalMethod {
    public static void main(String[] args) {
        Child child = new Child();
        
        child.normalMethod();  // Переопределённый метод в Child
        child.finalMethod();   // FINAL метод родителя (не изменился)
    }
}
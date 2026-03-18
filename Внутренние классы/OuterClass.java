
public class OuterClass {
    
    // === ПРАКТИКА 1: Разные спецификаторы доступа ===
    public class PublicInner {
        public void show() { System.out.println("Public inner"); }
    }
    
    protected class ProtectedInner {
        public void show() { System.out.println("Protected inner"); }
    }
    
    class PackageInner {
        public void show() { System.out.println("Package inner"); }
    }
    
    private class PrivateInner {
        public void show() { System.out.println("Private inner"); }
    }
    
    // === ПРАКТИКА 1: Поля внешнего класса ===
    private int privateOuter = 10;
    protected int protectedOuter = 20;
    int packageOuter = 30;
    public int publicOuter = 40;
    
    public class InnerAccess {
        public void accessOuter() {
            // Внутренний класс имеет доступ к полям внешнего
            System.out.println("  privateOuter = " + privateOuter);    
            System.out.println("  protectedOuter = " + protectedOuter); 
            System.out.println("  packageOuter = " + packageOuter);    
            System.out.println("  publicOuter = " + publicOuter);      
        }
        
        public void modifyOuter() {
            privateOuter = 100;    // и может даже изменять
            protectedOuter = 200;
            packageOuter = 300;
            publicOuter = 400;
        }
    }
    
    // === ПРАКТИКА #3: Поля внутреннего класса ===
    public class InnerWithFields {
        private int privateInner = 1;
        public int publicInner = 2;
        
        public int getPrivateInner() {
            return privateInner;
        }
    }
    
    public void accessInnerFields() {
        InnerWithFields inner = new InnerWithFields();
        //System.out.println("  publicInner = " + publicInner); // так нельзя
        // System.out.println(inner.privateInner); //  private не видно
        System.out.println("  publicInner = " + inner.publicInner);     // public видно
        System.out.println("  privateInner через геттер = " + inner.getPrivateInner()); // тоже видно
    }
    

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        System.out.println("=== ПРАКТИКА #1: Доступ из другого класса ===");
        //видны public, protected, package
        OuterClass.PublicInner pub = outer.new PublicInner();
        OuterClass.ProtectedInner prot = outer.new ProtectedInner();
        OuterClass.PackageInner pack = outer.new PackageInner();
        // OuterClass.PrivateInner priv = outer.new PrivateInner(); // private не видно
        
        pub.show();
        prot.show();
        pack.show();
        
        System.out.println("\n=== ПРАКТИКА #2: Доступ внутреннего к внешнему ===");
        OuterClass.InnerAccess inner = outer.new InnerAccess();
        System.out.println("До изменения:");
        inner.accessOuter();
        
        inner.modifyOuter();
        System.out.println("\nПосле изменения (inner изменил outer):");
        inner.accessOuter();
        
        System.out.println("\n=== ПРАКТИКА #3: Доступ внешнего к внутреннему ===");
        outer.accessInnerFields();
    }
}
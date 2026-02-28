public class OverloadingAndOverride {
      public static void main(String[] args) {
            Calculate calc = new Calculate();                    
             System.out.println(calc.add(5, 3));           // add(int a, int b) 
        System.out.println(calc.add(5, 3, 2));        // add(int a, int b, int c)        
        System.out.println(calc.add("Hello", "Kate"));   // add(String a, String b)

        System.out.println("Методы универсисета");
        University university = new University(); // Расписание занятий...
        university.shedule(); // Расписание занятий...
        university.price();// Стоимость обучения...
        university.hello(); // Политех самый лучший
         System.out.println("Методы пми");
         University pmi = new Pmi();
         pmi.shedule(); // Расписание занятий...
         pmi.price(); // Стоимость обучения...
         pmi.hello(); // Пми самый лучший


      }
    }

class Calculate {
    int add (int a,int b) {
        return a+b;
    }
    int add (int a, int b, int c)  { // Перегрузка
        return a+b+c;
    }
    String add (String a, String b) { // Перегрузка
        return a+ " " + b;
    }
}

class University {
    void shedule () {
        System.out.println("Расписание занятий...");
    }
    void price() {
        System.out.println("Стоимость обучения...");
    }

    void hello() {
        System.out.println("Политех самый лучший");
    }

}
class Pmi extends University {
    void SpecialCode() {
        System.out.println("12316148716");
    }
    @Override // переопределение
    void hello() {
          System.out.println("Пми самый лучший");
    }

}
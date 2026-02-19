


/**
*Главная функция
 *@author Хаймин Дмитрий
 *@version 1.0

 */
public class TestJavaDoc {
   public static void main(String args[]) {
    int d = Calculator.add(4,6);
    System.out.println(d);


   }
    
}


/**
*Калькулятор

*@author Хаймин Дмитрий
*@version 1.0

 */
class  Calculator {
    /**
     * Считает сумму двух целых чисел
     * @param a первое число int
     * @param b второе число int
     * @return сумма  
     */
    public static int add(int a, int b) {
        return a+b;
    }



}
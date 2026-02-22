/**
 * @author Хаймин Дмитрий
 * @version 1.0
* Практика #1 - decode()
 * Практика #2 - создание Boolean
 * Практика #3 - NullPointerException при автоупаковке/распаковке
 */
public class Wrapper {
    
 public static void main(String[] args) {

        // Практика #1

        // Десятичное число
        Integer d1 = Integer.decode("123");
        System.out.println("decode(\"123\") = " + d1);  // 123
        
        // Восьмеричное
        Integer d2 = Integer.decode("0123");    // 1*8^2 + 2*8^1+ 3*8^0 = 83
        System.out.println("decode(\"0123\") = " + d2);  // 83
        
        // Шестнадцатеричное (0x)
        Integer d3 = Integer.decode("0x1A");    // 1*16^1 + 10*16^0 = 26
        System.out.println("decode(\"0x1A\") = " + d3);  // 26
        
        Integer d4 = Integer.decode("0XFF");    // 15*16^1+15 = 255
        System.out.println("decode(\"0XFF\") = " + d4);  // 255


        //Практика #2


  
        // 1. valueOf() 
        Boolean v1 = Boolean.valueOf(true);           // true
        Boolean v2 = Boolean.valueOf("true");         // true
        Boolean v3 = Boolean.valueOf("FALSE");        // false
        Boolean v4 = Boolean.valueOf("hello");        // false
        

        // 2. Автоупаковка
        Boolean box1 = true;      
        Boolean box2 = false;
        
        // 3. Константы
        Boolean const1 = Boolean.TRUE;   // тот же объект всегда
        Boolean const2 = Boolean.FALSE;  // тот же объект всегда

        // Пратика #3
         // Исключение  NullPointerException возникает когда мы преобразуем из null в какой-либо тип

        Integer nullInt = null;
        
        // Так ошибки нет
        System.out.println("nullInt = " + nullInt);  // null
        
        // А вот это вызовет исключение:
        try {
            int x = nullInt;  // Попытка распаковать null в int
            System.out.println("Это не выполнится");
        } catch (NullPointerException e) {
            System.out.println("Ошибка!");
        }
        
        // То же с Boolean
        Boolean nullBool = null;
        try {
            boolean b = nullBool;  // ошибка распаковки
        } catch (NullPointerException e) {
            System.out.println("Ошибка!");
        }
        
        // В выражениях тоже
        Integer a = null;
        Integer b = 5;
        try {
            int sum = a + b;  // ошибка распаковки
        } catch (NullPointerException e) {
            System.out.println("Ошибка!");
        }
    }
}
    




    

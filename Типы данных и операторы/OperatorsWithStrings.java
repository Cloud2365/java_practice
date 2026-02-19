/**
 * Операторы в Java - примеры с числами и строками
 * @author Хаймин Дмитрий
 * @version 1.0
 */
public class OperatorsWithStrings {
    public static void main(String[] args) {
        
        System.out.println("=== ОПЕРАТОРЫ С ЧИСЛАМИ И СТРОКАМИ ===\n");
        
        // 1. Арифметические операторы (+, -, *, /, %)
        int a = 10, b = 3;
        String s1 = "10", s2 = "3";
        System.out.println("1. Арифметические:");
        System.out.println(a + " + " + b + " = " + (a + b)); // 13
        System.out.println(a + " / " + b + " = " + (a / b)); // 3
        System.out.println(a + " % " + b + " = " + (a % b)); // 1
        System.out.println(s1+s2); // 103
        
        // 2. Операторы сравнения (==, !=, >, <, >=, <=)
        System.out.println("\n2. Сравнение:");
        System.out.println("10 > 3 = " + (a > b)); // true
        System.out.println("10 == 3 = " + (a == b)); // false
        
        String strA = "Java";
        String strB = "Java";
        String strC = new String("Java");
        System.out.println("   Строки: 'Java' == 'Java' (литералы) = " + (strA == strB)); // true
        System.out.println("   Строки: 'Java' == new String('Java') = " + (strA == strC)); // false так как разные объекты
        System.out.println(strA.equals(strC)); // true
        
        // 3. Логические операторы (&&, ||, !)
        boolean t = true, f = false;
        System.out.println("\n3. Логические:");
        System.out.println("   true && false = " + (t && f)); // false
        System.out.println("   true || false = " + (t || f)); // true
        
        // 4. Инкремент/декремент (++, --)
        int x = 5;
        System.out.println("\n4. Инкремент/декремент:");
        System.out.println(" x = " + x);
        System.out.println("   Постфиксный x++ = " + (x++)); // 5
        System.out.println("x = " + x); // 6
        x = 5;
        System.out.println("   Префиксный ++x = " + (++x)); // 6
        System.out.println("x = " + x); // 6

        
        // 5. Присваивание с операцией (+=, -=, *=, /=, %=)
        int y = 10;
        y += 5;
        System.out.println("\n5. Присваивание с операцией:");
        System.out.println("y += 5 = " + y); //15
        
        String text = "Java";
        text += " ";
        text += "17";
        System.out.println("Java + \" \" + \"17\" = " +text); // Java 17
        
        // 6. Тернарный оператор (?:)
        int age = 20;
        String status = (age >= 18) ? "взрослый" : "ребёнок";
        System.out.println("\n6. Тернарный оператор:");
        System.out.println("   возраст " + age + " -> " + status);
  
        // 7. Побитовые операторы (&, |, ^, ~)
        int bit1 = 5;  // 0101
        int bit2 = 3;  // 0011
        System.out.println("\n7. Побитовые операторы:");
        System.out.println("   Числа: 5 & 3 = " + (bit1 & bit2)); // 1
        System.out.println("   Числа: 5 | 3 = " + (bit1 | bit2)); // 7

        
        // 8. Сдвиги (<<, >>, >>>)
        int shift = 8;  // 1000
        System.out.println("\n8. Сдвиги:");
        System.out.println("   Числа: 8 << 1 = " + (shift << 1)); // 16
        System.out.println("   Числа: 8 >> 1 = " + (shift >> 1) + " (деление на 2)"); // 4

        
        // 9. Конкатенация строк (+ и +=) - ОСНОВНОЕ ДЛЯ СТРОК
        System.out.println("\n9. КОНКАТЕНАЦИЯ СТРОК:");
        String hello = "Привет";
        String space = " ";
        String target = "мир";
        
        String result1 = hello + space + target + "!";
        System.out.println(result1); // Привет мир!
        
        String result2 = "Число " + 42 + " и " + 3.14;
        System.out.println("   + с числами: " + result2); // Число 42 и 3.14
        
        String builder = "Я";
        builder += " люблю";
        builder += " джаву";
        System.out.println("   += : " + builder); // Я люблю джаву    
}
}
public class StringBuilderDemo {
    public static void main(String[] args) {
        
        System.out.println("=== 10 МЕТОДОВ STRINGBUILDER ===\n");
        
        // 1. append() - добавляет в конец
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" ");
        sb.append("Programming");
        sb.append(" 17");
        System.out.println("1. append(): " + sb);  // Java Programming 17
        
        // 2. insert() - вставляет по индексу
        sb.insert(4, " (язык)");
        System.out.println("2. insert(): " + sb);  // Java (язык) Programming 17
        
        // 3. delete() - удаляет диапазон (начало, конец не включается)
        sb.delete(5, 12);
        System.out.println("3. delete(): " + sb);  // Java Programming 17
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("4. deleteCharAt(): " + sb);  // Java Programming 1
        
        // 5. replace() - заменяет диапазон
        sb.replace(0, 4, "Python");
        System.out.println("5. replace(): " + sb);  // Python Programming 1
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse(): " + sb);  // 1 gnimmargorP nohtyP
        
        sb.reverse();  // вернём обратно
        
        // 7. charAt() / setCharAt() - получение и установка символа
        System.out.println("7. charAt(0): " + sb.charAt(0));  // P
        sb.setCharAt(0, 'J');
        System.out.println("   setCharAt(0, 'J'): " + sb);     // Jython Programming 1
        
        // 8. indexOf() / lastIndexOf() - поиск подстроки
        System.out.println("8. indexOf(\"thon\"): " + sb.indexOf("thon"));        // 1
        System.out.println("   lastIndexOf(\"n\"): " + sb.lastIndexOf("n"));      // 16
        
        // 9. substring() - извлекает подстроку (возвращает String)
        String sub = sb.substring(0, 6);
        System.out.println("9. substring(0,6): " + sub);  // Jython
        
        // 10. capacity() / length() / ensureCapacity() - управление размером
        System.out.println("10. length(): " + sb.length());          // 20
        System.out.println("    capacity(): " + sb.capacity());      // 26 исходная ёмкость
        sb.ensureCapacity(100);
        System.out.println("    capacity() после ensureCapacity(100): " + sb.capacity()); // 100
        
      
    }
}
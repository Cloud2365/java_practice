public class ConversionDemo {
    public static void main(String[] args) {
        
        System.out.println("=== ПРЕОБРАЗОВАНИЕ МЕЖДУ ТИПАМИ ===\n");
        
        // ===== 1. String -> StringBuilder =====
        String str = "Hello, Java!";
        System.out.println("1. Исходная String: " + str);
        
        // Способ 1: конструктор
        StringBuilder sb = new StringBuilder(str);
        System.out.println("   StringBuilder(str): " + sb);
        
        // Способ 2: append()
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        System.out.println("   append(str): " + sb2);
        
        // ===== 2. String -> StringBuffer =====
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("\n2. StringBuffer(str): " + sbf);

        
        // ===== 3. StringBuilder -> String =====
        StringBuilder sb3 = new StringBuilder("Dynamic string");
        String strFromSb = sb3.toString();
        System.out.println("\n3. StringBuilder → String: " + strFromSb);
        
        // ===== 4. StringBuffer -> String =====
        StringBuffer sbf2 = new StringBuffer("Buffer content");
        String strFromSbf = sbf2.toString();
        System.out.println("4. StringBuffer -> String: " + strFromSbf);
        
        // ===== 5. StringBuilder -> StringBuffer =====
        StringBuilder sb4 = new StringBuilder("From StringBuilder");
        StringBuffer sbf3 = new StringBuffer(sb4);
        System.out.println("\n5. StringBuilder -> StringBuffer: " + sbf3);
        
        // ===== 6. StringBuffer → StringBuilder =====
        StringBuffer sbf4 = new StringBuffer("From StringBuffer");
        StringBuilder sb5 = new StringBuilder(sbf4);
        System.out.println("6. StringBuffer -> StringBuilder: " + sb5);
        
        // ===== 7. Сравнение производительности =====
        System.out.println("\n=== СРАВНЕНИЕ ПРОИЗВОДИТЕЛЬНОСТИ ===\n");
        
        // Плохо: String в цикле
        long start = System.nanoTime();
        String strConcat = "";
        for (int i = 0; i < 10000; i++) {
            strConcat += i;
        }
        long end = System.nanoTime();
        System.out.println("String конкатенация: " + (end - start) / 1_000_000 + " ms"); // 96 ms
        
        // Хорошо: StringBuilder в цикле
        start = System.nanoTime();
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sbBuilder.append(i);
        }
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1_000_000 + " ms"); // 2 ms
        
        // Практические преобразования
        System.out.println("\n=== ПРАКТИЧЕСКИЕ ПРИМЕРЫ ===\n");
        
        // Изменение строки и обратно
        String text = "Это пример текста";
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();
        String reversed = builder.toString();
        System.out.println("Оригинал: " + text);
        System.out.println("Переворот: " + reversed);
        
        // Добавление символов
        StringBuilder html = new StringBuilder("<ul>");
        String[] items = {"Яблоко", "Банан", "Апельсин"};
        for (String item : items) {
            html.append("<li>").append(item).append("</li>");
        }
        html.append("</ul>");
        System.out.println("Сгенерированный HTML: " + html);
    }
}

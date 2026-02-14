    public class Operation {
    public static void main(String[] args) {
        
        System.out.println("=== ЦЕЛЫЕ ТИПЫ ===\n");
        
        byte b = 50;        
        short s = 1000;    
        int i = 100000;     
        long l = 100000000L; 
        
        float f = 3.5f;
        double d = 2.5;
        
        // byte + short -> int 
        int result1 = b + s;  
    
        // int + long -> long (больший тип)
        long result2 = i + l;  
        
        // int + float -> float
        float result3 = i + f;  

        
        // int + double -> double
        double result4 = i + d;  

       
        // float + double -> double
        double result5 = f + d;  

        // =============================Сужающие преобразования========================
        // long -> short
        short fromLongToShort = (short) l; 
         System.out.println("long -> short: " + l + " -> " + fromLongToShort ); // -7936
          //  float -> int (
        int fromFloatToInt = (int) f;  
        System.out.println("float -> int: " + f + " -> " + fromFloatToInt); // 3
        
        // int -> short 
        short fromIntToSHort = (short) i;  
        System.out.println("int -> short: " + i + " -> " + fromIntToSHort); // -31072
        
        // int -> byte
        byte fromIntToByte = (byte) i;  
        System.out.println("int -> byte: " + i + " -> " + fromIntToByte ); // -96
        
        byte fromShortToByte = (byte) s;  
        System.out.println("short -> byte: " + s + " -> " + fromShortToByte); // -24
         int a = 120;

     

    }

}

    
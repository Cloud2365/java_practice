import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
       
         int[] numbers1 = {4, 2, 7, 1, 9};
         int[] numbers2 = {1, 3, 5, 7, 9, 11, 13};
         int[] numbers3 ={1,3,5,7,9,16,8};

        String[] names1 = {"Иван", "Мария", "Анна"};
        String[] names2 = {"Иван", "Мария", "Анна"};
        
         // 1. toString (преобразование в строку)

        System.out.println(numbers1); // пишется хэш [I@6b95977
        System.out.println(names1); // и тут хэш
        
        
        System.out.println("numbers1 = " + Arrays.toString(numbers1)); // numbers1 = [4, 2, 7, 1, 9]
        System.out.println("names1 = " + Arrays.toString(names2)); // names = [Иван, Мария, Анна]

        // 2. binarySearch (бинарный поиск)
        // Поиск существующего элемента в отсортированном массиве
         int index1 = Arrays.binarySearch(numbers2, 7);
        System.out.println("Индекс числа 7: " + index1);  // 3
    
        
        // Поиск несуществующего элемента в отсортированном массиве
        int index2 = Arrays.binarySearch(numbers2, 6);
        System.out.println("Индекс числа 6: " + index2);  // -4 (отрицательное число)

        // Поиск существующего элемента в неотсортированном массиве
        int index3 = Arrays.binarySearch(numbers1, 1); 
        System.out.println("Индекс числа 1: " + index3);   // -1 (отрицательное число)

         // 3. equals (сравнение)
        System.out.println("names1 == names2: " + (names1 == names2));  // false (разные объекты)
        
        System.out.println("Arrays.equals(names1, names2): " + Arrays.equals(names1, names2));  // true
        System.out.println("Arrays.equals(numbers1, numbers2): " + Arrays.equals(numbers1, numbers2)); // false
        
        // 4. compare (лексиграфическое сравнение)
        System.out.println("compare(names1, names2): " + Arrays.compare(names1, names2));  // 0 (равны)
        System.out.println("compare(numbers1, numbers2): " + Arrays.compare(numbers1, numbers2));  // 1  (numbers1 > numbers2)
        System.out.println("compare(numbers2, numbers3): " + Arrays.compare(numbers2, numbers3));  // -1 (numbers2 < numbers3)

        // 5. sort (сортировка)
        Arrays.sort(numbers3);
        System.out.println("sort(numbers): " + Arrays.toString(numbers3)); // [1, 3, 5, 7, 8, 9, 16]
        // сортировка по индексам
        Arrays.sort(numbers2,4,6);
        System.out.println("sort(numbers): " + Arrays.toString(numbers2)); // [1, 3, 5, 7, 8, 9, 16]
        Arrays.sort(names1);
        System.out.println("sort(names1): " + Arrays.toString(names1)); // [Анна, Иван, Мария]

    }
    
}

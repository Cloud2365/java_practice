public class Enum {
public static void main(String[] args) {
      WeekDay today = WeekDay.MONDAY;
      System.out.println(today);
        System.out.println("Сегодня: " + today.getName());
        System.out.println("Номер дня: " + today.getDayNumber());
        
        // Проверка выходных
        System.out.println("\n=== Проверка выходных ===");
        System.out.println("Понедельник выходной? " + WeekDay.MONDAY.isWeekend());
        System.out.println("Суббота выходной? " + WeekDay.SATURDAY.isWeekend());
        System.out.println("Воскресенье выходной? " + WeekDay.SUNDAY.isWeekend());
        
        // Следующий день
        System.out.println("\n=== Следующий день ===");
        System.out.println("После Понедельника: " + WeekDay.MONDAY.nextDay().getName());
        System.out.println("После Воскресенья: " + WeekDay.SUNDAY.nextDay().getName());

        // Предыдущий день
        System.out.println("\n=== Предыдущий день ===");
        System.out.println("Перед Понедельником: " + WeekDay.MONDAY.previousDay().getName());
        System.out.println("Перед воскресеньем: " + WeekDay.SUNDAY.previousDay().getName());
    
}
}

 enum WeekDay {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

     private String DayName;
    private int dayNumber;
    
    // Конструктор
    WeekDay(String DayName, int dayNumber) {
        this.DayName = DayName;
        this.dayNumber = dayNumber;
    }
     public String getName() {
        return DayName;
    }
    
    public int getDayNumber() {
        return dayNumber;
    }
    // Проверка выходной ли сейчас
       public String isWeekend() {

        if (this == SATURDAY || this == SUNDAY) {
            return "Да";
        }
        return "Нет";
    }
    // Получить следующий день
    public WeekDay nextDay() {
        WeekDay[] days = values();
        int nextIndex = (this.ordinal() + 1) % days.length;
        return days[nextIndex];
    }
    
    // Получить предыдущий день
    public WeekDay previousDay() {
        WeekDay[] days = values();
        int prevIndex = (this.ordinal() - 1 + days.length) % days.length;
        return days[prevIndex];
    }

}


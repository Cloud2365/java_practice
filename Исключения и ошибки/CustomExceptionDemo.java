// 1. Создаём своё исключение (наследуем от Exception)
class InvalidAgeException extends Exception {
    
    // Конструктор 1: без параметров
    public InvalidAgeException() {
        super("Недопустимый возраст");
    }
    
    // Конструктор 2: с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор 3: с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// 2. Используем исключение
public class CustomExceptionDemo {
    
    public static void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст " + age + " недопустим");
        }
        System.out.println("Возраст установлен: " + age);
    }
    
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        try {
            setAge(25);  // нормально
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
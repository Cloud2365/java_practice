public class ClassSpecifiers {
    public static void main(String[] args) {
        Message message = new Message();
        System.out.println("message.default_message: " + message.default_message); // работает
        System.out.println("message.protected_message: " + message.protected_message); // работает
        System.out.println("message.public_message: " + message.public_message); // работает
        // System.out.println(msg.private_message); // с private не работает

        // message.printPrivateMessage(); // c private не работает
        message.printDefaultMessage(); // работает
        message.printProtectedMessage(); // работает
        message.printPublicMessage(); // работает
        message.printAllMessages(); // работает со всеми даже с private так как внутри класса

    }
}

class Message {
     private String private_message = "Эта переменная типа private";
      String default_message = "Эта переменная без спецификатора";
      protected String protected_message = "Эта переменная типа protected";
       public String public_message = "Эта переменная типа public";



       
       private void printPrivateMessage(){
        System.out.println("Это сообщение из private метода");
       }
        void printDefaultMessage(){
        System.out.println("Это сообщение из default метода");
       }
       protected void printProtectedMessage(){
        System.out.println("Это сообщение из protected метода");
       }
       public void printPublicMessage(){
        System.out.println("Это сообщение из public метода");
       }
     void printAllMessages() {
        System.out.println("--- Все переменные внутри класса ---");
        System.out.println(private_message);    
        System.out.println(default_message);    
        System.out.println(protected_message);  
        System.out.println(public_message);     
    }    
}

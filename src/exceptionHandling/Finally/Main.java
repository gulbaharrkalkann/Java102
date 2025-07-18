package exceptionHandling.Finally;

public class Main {
    public static void main(String[] args) {

       try {
       int a=30/0;
       }
       catch (ArithmeticException e) {
              System.out.println("Caught an ArithmeticException");
       }
       catch (NullPointerException e) {
           System.out.println("Caught a NullPointerException");
       }
       finally {
           System.out.println("This block always executes, regardless of an exception.");
       }
    }
}
//Finally bloğu her koşulda çalışır, yani try bloğunda bir istisna oluşsa da oluşmasa da çalışır.

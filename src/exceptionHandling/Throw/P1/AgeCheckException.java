package exceptionHandling.Throw.P1;

public class AgeCheckException extends Exception {
    public AgeCheckException(String message) {

        super(message);
        System.out.println("Yaş hatası alındı.");
    }
}

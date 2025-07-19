package exceptionHandling.Throw.P3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        Calculator calculator = new Calculator();

        try {
            long result = calculator.power(n, p);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}

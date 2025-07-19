package exceptionHandling.Throw.P1;

import java.util.Scanner;

public class Main {
    public static void checkage(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Hata yakalandı");
        }
        System.out.println("Yaşınız uygundur");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");

        int age = scanner.nextInt();
        try {
            checkage(age);
        } catch (Exception e) {
            System.out.println("Yaşı uymadı");
            System.out.println(e.toString());
        }

        System.out.println("Program sonlandı");
    }
}

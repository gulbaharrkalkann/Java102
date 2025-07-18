package exceptionHandling.Throw.P2;

import java.util.Scanner;

public class Main {
    public static void mekanKontrol(int age) {
        if (age < 18) {
            throw new ArithmeticException();
        }else
            System.out.println("Mekan girişine uygunsunuz");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age= scanner.nextInt();
        try {
            mekanKontrol(age);
        } catch (ArithmeticException e) {
            System.out.println("Mekan girişine uygun değilsiniz");

        }

    }}

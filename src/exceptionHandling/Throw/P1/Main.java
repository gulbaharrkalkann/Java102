package exceptionHandling.Throw.P1;

import java.util.Scanner;

public class Main {
    public static void chechage(int age){
        if (age < 18) {
            throw new IndexOutOfBoundsException("Yaşınız 18'den küçük olamaz");
        } else {
            System.out.println("Yaşınız uygundur");
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");

        int age= scanner.nextInt();
        try {
            chechage(age);
        } catch (Exception e) {
            System.out.println("Yaşı uymadı");
            System.out.println(e.toString());
        }


    }
}

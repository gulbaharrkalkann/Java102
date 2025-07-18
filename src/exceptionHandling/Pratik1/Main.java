package exceptionHandling.Pratik1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{

            int x=scanner.nextInt();

            int y = scanner.nextInt();
            System.out.println(x/y);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");

        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: "+e.getMessage());
        }
        finally {
            scanner.close();
        }

    }

    }


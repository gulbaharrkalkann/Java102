package Collection.VectorlerveStackler.Pratik2;

import java.util.Scanner;
import java.util.Stack;

//Stackler ile bir kelimenin palindrom olup olmadığını kontrol eden bir program
public class Main {
    public static boolean isPalindrome(String kelime,Stack<Character> stack){
        for (int i =(kelime.length()/2 )+1;i< kelime.length(); i++) {
            if(kelime.charAt(i) != stack.pop()){

                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<kelime.length()/2; i++) {
            stack.push(kelime.charAt(i));
        }
        if (isPalindrome(kelime,stack)){
            System.out.println("Kelime palindromdur.");
        } else {
            System.out.println("Kelime palindrom değildir.");
        }
    }
}

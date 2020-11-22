import javax.swing.*;
import java.util.Scanner;

public class Palindrome {

    /*
        TODO
            -create a GUI
            -import file method
     */

    public static void main(String[] args) {

        System.out.println("Hi please type a word: ");
        Scanner scan = new Scanner(System.in);
        String original = scan.next();
        original = original.replace(" ", "");

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reverse +=original.charAt(i);

            /* If you want to print the reverse word
            System.out.println(reverse); */
        }

        boolean palindrome = true;
        for(int i =0; i < original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }

        System.out.println();
        if(palindrome){
            System.out.println("Nice, that word is a Palindrome!");
        }else{
            System.out.println("That word is not a Palindrome!");
        }


    }

}

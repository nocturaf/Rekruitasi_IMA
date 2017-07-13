import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String word,reverseWord = "";
        Scanner userin = new Scanner(System.in);
        System.out.print("Masukka Kata : ");
        word = userin.next();
        for (int i = 0; i < word.length(); i++) {
            reverseWord += word.charAt(i);
        }
        if (word.equals(reverseWord))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
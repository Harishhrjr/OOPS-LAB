import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int length = word.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                isPalindrome = false;
                break; // Exit loop early if mismatch found
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        
    }
}

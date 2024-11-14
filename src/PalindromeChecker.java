import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть слово: ");
        String word = scanner.nextLine().toLowerCase();

        if (isPalindrome(word)) {
            System.out.println("Слово є паліндромом.");
        } else {
            System.out.println("Слово не є паліндромом.");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

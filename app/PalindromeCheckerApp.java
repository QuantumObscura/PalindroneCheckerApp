public class PalindromeCheckerApp {
    public static void main(String[] args) { // Fixed String case
        String str = "madam"; // Added semicolon
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            // Fixed dot notation and spelling of length()
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) { // Fixed variable case
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

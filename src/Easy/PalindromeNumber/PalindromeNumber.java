package Easy.PalindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[chars.length - i]) {
                return false;
            }
        }
        return true;
    }

    // Эталонное решение
    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
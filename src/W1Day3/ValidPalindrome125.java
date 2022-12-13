package W1Day3;

public class ValidPalindrome125 {
    static public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0, j = s1.length() - 1; i < s1.length() / 2; i++, j--) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ValidPalindrome125.isPalindrome("wdaawd"));
    }
}

package W1Day2;

public class FirstUniqueCharacterInAString387 {
    static public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;        //O(n)
        }
        for (int i = 0; i < s.length(); i++) {          //O(n)
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(FirstUniqueCharacterInAString387.firstUniqChar("leetcode"));
    }
}

package W1Day3;

import java.util.Arrays;

public class BitSwap {

    //Very Bad Code;

    static public int[] swap(int x,int i,int j){
        String s = Integer.toBinaryString(x);
        int[] chars = new int[32];
        Arrays.fill(chars, 0);
        int n = 1;
        for (int k = chars.length-1; k >= chars.length-s.length(); k--,n++) {
            chars[k] = s.charAt(s.length()-n) - 48;

        }
        int k;
        k = chars[chars.length-i];
        chars[chars.length-i] = chars[chars.length-j];
        chars[chars.length-j]=k;

        return chars;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(12));
        int[] swap = BitSwap.swap(12, 3, 5);
        for (int i = 0; i < swap.length; i++) {
            System.out.print(swap[i] + " ");
        }

    }
}

package W1Day3;

public class BitCount2 {
     public String bitCount(int x){
        String s = Integer.toBinaryString(x);
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '1'){
                k++;
            }
        }
        if (k%2==0)
        {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        BitCount2 bitCount2 = new BitCount2();
        System.out.println(bitCount2.bitCount(7));
    }
}

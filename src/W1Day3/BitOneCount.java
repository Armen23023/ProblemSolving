package W1Day3;
// 1. հաշվել թվի 1 արժեքով բիթերի քանակը
public class BitOneCount {
    static public int bitCount(int x){
        String s = Integer.toBinaryString(x);
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '1'){
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(BitOneCount.bitCount(7));
    }
}

package W1Day3;

public class BItReverse {
    static public String reverse(int x){
        String s = Integer.toBinaryString(x);
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        s = s2 + s1;


        return  s;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(132));
        System.out.println(BItReverse.reverse(132));
    }

}

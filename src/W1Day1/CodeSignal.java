package W1Day1;

import java.util.Arrays;

public class CodeSignal
{
   static int solution(int n, int k) {
//        String s = Integer.toBinaryString(n);
//        char[] chars = s.toCharArray();
//
//        if (chars[chars.length-k]==0) return n;
//        else {
//            chars[chars.length-k]='0';
//        }
//        int result=1;
//        int arr[]= new int[chars.length];
//       for (int i = chars.length-2; i >= 0; i--) {
//           int numericValue = Character.getNumericValue(chars[i]);
//           result = result * 2;
//           if (numericValue==1) {
//               arr[i] =  result;
//           }
//           }
//            int sum = 0;
//       for (int i = 0; i < arr.length; i++) {
//            sum =  sum + arr[i] ;
//       }
//        return sum+1;

       return n & ~(1 << (k - 1));
   }




//    public static void main(String[] args) {
//        int solution = CodeSignal.solution(2147483647, 16);
//        System.out.println(solution);
//    }
}

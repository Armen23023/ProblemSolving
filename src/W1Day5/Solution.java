package W1Day5;

class Solution1 {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int t=0;
        for (int i = 0,j=0; i < nums1.length; i++) {
            if(n==0) break;
            if (nums2[j]>nums1[i] && nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
                continue;
            }
            if (nums2[j]==0){
                j++;
                if (j==n){
                    break;
                }
            }
            if (j==n-1&&nums2[j]>nums1[i]){
                t = nums2[j];
                nums2[j] = nums1[i+1];
                nums1[i+1] = t;
            }
            if ( nums2[j]>nums1[i]){
                t = nums2[j];
                nums2[j] = nums1[i+1];
                nums1[i+1] = t;
            }
            else {
                t = nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1] = t;
            }
            if (nums2[j]==nums1[i]){
                t = nums2[j];
                nums2[j] = nums1[i+1];
                nums1[i+1] = t;
            }
        }


    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};

        Solution1.merge(nums1,3,nums2,3);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}

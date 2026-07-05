class Solution {
    static int findMaxConsecutiveOnes(int[] a) {
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {  
                count++;
                maxcount = Math.max(maxcount,count);
            } else {
                count = 0;  
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(a)); 
    }
}
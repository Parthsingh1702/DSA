class Solution {
    static int removeDuplicates(int[] nums) {
        int rd = 0 ;
        for (int i=1; i <nums.length; i++){
            if(nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
    public static void main(String[] args) {
       int[] nums ={1,1,2};
       for (int i=0;i<nums.length;i++){
         System.out.print(nums[i]+" ");
       }
       int rd = removeDuplicates(nums);
       for(int i=0;i<rd;i++){
        System.out.print(nums[i]+" ");
       }
    }
}
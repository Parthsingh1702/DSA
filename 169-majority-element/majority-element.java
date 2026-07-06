class Solution {
    static int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes=1;
        for (int i=1;i<nums.length;i++){
            if(votes == 0){
                votes++;
                majority = nums[i];
            }else if (majority == nums[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
        
    }
    public static void main(String[] args){
        int[] a = {2,2,3,4,2,1};
        System.out.println(majorityElement(a));
    }
}
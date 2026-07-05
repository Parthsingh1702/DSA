class Solution {
    public int maxProfit(int[] nums) {
        int bprice = nums[0];
        int profit = 0;
        for (int i = 1;i<nums.length;i++){
            if(nums[i]<bprice){
                bprice= nums[i];
            }
            else{
                int cprofit = nums[i] - bprice;
                profit = Math.max(cprofit,profit);
            }
        }
        return profit;
    }
    public  void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));  
    }
}
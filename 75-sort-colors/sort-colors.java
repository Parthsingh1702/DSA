class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while (mid<=high){
            switch(nums[mid]){
                case 0:
                swap(nums,mid,low);
                low++;
                mid++;
                break;

                case 1:
                mid++;
                break;


                case 2:
                swap(nums,mid,high);
                high--;
                break;
            }
        }
    }
    private void swap (int[]arr,int pos1,int pos2){
        int temp= arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
}
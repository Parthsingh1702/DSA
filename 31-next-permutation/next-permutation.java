class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: find the first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot found, reverse entire array
        if (pivot == -1) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            return;
        }

        // Step 3: find the next greater element from right
        for (int i = n - 1; i > pivot; i--) {  // ✅ fixed condition
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Step 4: reverse the suffix after pivot
        int start = pivot + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // For testing
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 1}; // descending order → [1, 2, 3]
        s.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


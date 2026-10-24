class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // Step 1: Piche se pehla chhota element (breakpoint) dhoondo
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: Agar breakpoint mil gaya, toh usse thoda sa bada number dhoondo aur swap karo
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        // Step 3: i ke aage ke saare elements ko reverse kar do
        reverse(nums, i + 1, nums.length - 1);
    }
    
    // Do numbers ko aapas mein badalne (swap karne) ka helper method
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Array ke ek hisse ko palatne (reverse) karne ka helper method
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
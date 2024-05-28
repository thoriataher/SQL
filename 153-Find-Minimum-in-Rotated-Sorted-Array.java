class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right = nums.length -1;

        if(nums.length == 1) return nums[0];

        while(left < right){
            if(nums[left] < nums[right]) return nums[left];
            else{
            return nums[right];
        }
        }
        return -1;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int t=0;
        for(int i=0; i<nums.length; i++){
           for(int j=i; j<nums.length-1; j++){
                if(nums[j]==0){
                    t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
    }
}
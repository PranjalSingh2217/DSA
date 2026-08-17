class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int min=nums[i];
            int min_index=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=nums[i];
                nums[i]=nums[min_index];
               nums[min_index]=temp;
            }

        }
        
    }
}
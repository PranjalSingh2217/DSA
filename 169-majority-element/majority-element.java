class Solution {
    public int majorityElement(int[] nums) { 
        int major=nums[0];
        int vote=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==major) {
                vote++;
            }
            else if(nums[i]!=major && vote==0){
                major=nums[i];
            }
            else{
                vote--;
            }
        }  
        return major ;
        
    }
}
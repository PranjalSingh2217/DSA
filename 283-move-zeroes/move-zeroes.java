class Solution {
    public void moveZeroes(int[] nums) {
        int nz=0;
        int z=0;
        while(nz<nums.length){
            if(nums[nz]!=0){
                swap(nz,z,nums);
                nz++;
                z++;
            }
            else
        {
            nz++;
        }
        }
        
    }
    static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
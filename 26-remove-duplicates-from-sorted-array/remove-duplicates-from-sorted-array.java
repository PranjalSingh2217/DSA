class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
 
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]){
                continue;
            }
            else
            {
                arr[count]=nums[i+1];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

    return count;
    }

}
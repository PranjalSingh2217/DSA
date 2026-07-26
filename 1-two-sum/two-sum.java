class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1=0;
        int num2=num1+1;
        int[] arr=new int[2];
        while(num1<nums.length-1){
            if(nums[num1]+nums[num2]==target){
                arr[0]=num1;
                arr[1]=num2;
              return arr;
            }
            else{
                num2++;
            }
            if(num2==nums.length){
                num1++;
                num2=num1+1;
            }
        }
            return arr;
    
    }

}

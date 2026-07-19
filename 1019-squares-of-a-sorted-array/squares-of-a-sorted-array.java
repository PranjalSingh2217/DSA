class Solution {
    public int[] sortedSquares(int[] nums) {
        sqr(nums);
        insertionsort(nums);
        return nums;
    
    }
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while( j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;

            }     
            arr[j+1]=current;
            
       }
    }
    public static void sqr(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(nums.length<2){
            return nums;
        }
     
        int minIndex=n/2;
        int[] leftHalf=new int[minIndex];
        int[] rightHalf=new int[n-minIndex];
        for(int i=0;i<minIndex;i++){
            leftHalf[i]=nums[i];
        }
        for(int i=minIndex;i<n;i++){
            rightHalf[i-minIndex]=nums[i];
        }

        sortArray(leftHalf);
                sortArray(rightHalf);
        merge(nums,leftHalf,rightHalf);
        return nums;
        
    }

public static void merge(int[] nums,int[] leftHalf,int[] rightHalf){
    int leftSize=leftHalf.length;
    int rightSize=rightHalf.length;
    int i=0,j=0,k=0;
    while(i<leftSize && j<rightSize){
        if(leftHalf[i]<=rightHalf[j]){
            nums[k]=leftHalf[i];
            i++;
        }
        else{
            nums[k]=rightHalf[j];
            j++;
        }
        k++;
    }
    while(i<leftSize){
        nums[k]=leftHalf[i];
        i++;
        k++;
    }
    while(j<rightSize){
        nums[k]=rightHalf[j];
        j++;
        k++;
    }

}
}
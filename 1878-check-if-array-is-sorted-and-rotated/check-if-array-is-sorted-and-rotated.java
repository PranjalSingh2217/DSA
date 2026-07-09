class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[] sorted=sort(nums);
        for(int s=0;s<n;s++){
            boolean match=true;
            for(int i=0;i<n;i++){
                if(sorted[i]!=nums[(s+i)%n]){
                    match=false;
                    break;

                }
            }
           if(match){
            return true;
           }
        }
        
        return false;
        
        
    }
    public int[] sort(int[] arr){
       int[] sorted=arr.clone();
        for(int i=0;i<arr.length-1;i++){
            int ind_min=i;
            for(int j=i+1;j<arr.length;j++){
                if(sorted[j]<sorted[ind_min]){
                 ind_min=j;
                }
            }
            if(ind_min!=i){
                int temp=sorted[i];
                sorted[i]=sorted[ind_min];
                sorted[ind_min]=temp;
            }
        }
        return sorted;
}
}
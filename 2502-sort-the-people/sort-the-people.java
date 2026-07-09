class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1;i++){
            int min=heights[i];
            int min_ind=i;
            {
                for(int j=i+1;j<heights.length;j++){
                    if(heights[j]>min){
                        min=heights[j];
                        min_ind=j;
                    }
                }
                
                if(min_ind!=i){
                    int temp=heights[i];
                    heights[i]=heights[min_ind];
                    heights[min_ind]=temp;
                    String temp_str=names[i];
                    names[i]=names[min_ind];
                    names[min_ind]=temp_str;

                }
            
        }
        
    }
    return names;
    }
}

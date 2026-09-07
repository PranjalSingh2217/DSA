class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toLowerCase().toCharArray();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='a' && arr[i]<='z' || arr[i]>='0' && arr[i]<='9' ){
                l.add(arr[i]);
            }
        }
        int front=0;
        int back=l.size()-1;
        while(front<=back){
            if(l.get(front).equals(l.get(back))){
                front++;
                back--;
            }
            else {
                return false;
           
            }
           
        }

     return true;
  
    }
}
 class MyStack{
        ArrayList<Character> list= new ArrayList<Character>();
        public void push(char data){
            list.add(data);
        }
        public void pop(){
           if(list.isEmpty()){
                return;
            }
            list.remove(list.size()-1); 
        }
    }
class Solution {
   
    public boolean isValid(String s) {
        MyStack obj=new MyStack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') obj.push(s.charAt(i));
          else{
            if(obj.list.isEmpty()){
                return false;
            }
            char top = obj.list.get(obj.list.size() - 1);
                
                if (s.charAt(i) == '}' && top != '{') return false;
                if (s.charAt(i) == ']' && top != '[') return false;
                if ( s.charAt(i)== ')' && top != '(') return false;
                
                obj.pop();

          }

        }
        return obj.list.isEmpty();
    
    }
}
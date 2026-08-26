class MinStack {

        ArrayList<Integer> main=new ArrayList<>();
        ArrayList<Integer> sub=new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        main.add(value);
        if(sub.isEmpty()){
            sub.add(value);
        }
        else{
            sub.add(Math.min(value,sub.get(sub.size()-1)));
        }

        
    }
    
    public void pop() {
        if(main.isEmpty()){
            return;
        }
        else{
            main.remove(main.size()-1);
            sub.remove(sub.size()-1);
            return;
        }
    }
    
    public int top() {
       return main.get(main.size()-1);
    }
    
    public int getMin() {
       return sub.get(sub.size()-1);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
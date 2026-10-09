class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> outputStack;
    public MyQueue() {
        stack=new Stack<>();
        outputStack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
       while(stack.size()>1){
            outputStack.push(stack.pop());
        }
        int val=stack.pop();
        while(outputStack.size()!=0){
            stack.push(outputStack.pop());
        }
        return val;
 
        
    }
    
    public int peek() {
           while(stack.size()>1){
            outputStack.push(stack.pop());
        }
        int val=stack.peek();
         while(outputStack.size()!=0){
            stack.push(outputStack.pop());
        }
    return val;
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
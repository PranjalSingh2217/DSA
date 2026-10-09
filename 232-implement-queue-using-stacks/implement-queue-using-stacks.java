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
        peek();
        return outputStack.pop();
    }
    
    public int peek() {
        if(outputStack.isEmpty()){
            while(!stack.isEmpty()){
                            outputStack.push(stack.pop());
            }
        }
        return outputStack.peek();
        
        
    }
    public boolean empty() {
        return stack.isEmpty() && outputStack.isEmpty();
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
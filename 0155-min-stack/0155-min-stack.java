class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min_stack;
    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(min_stack.isEmpty() || value<=min_stack.peek()){
            min_stack.push(value);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            if(stack.peek().equals(min_stack.peek())){
                min_stack.pop();
            }
            stack.pop();
        }
    }
    
    public int top() {
        if(stack.isEmpty())
            return 0;
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
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
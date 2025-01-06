class MyQueue {
    Stack<Integer>i=new Stack<>();
    Stack<Integer>o=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        i.push(x);
    }
    
    public int pop() {
        int top=peek();
        o.pop();
        return top;
    }
    
    public int peek() {
        if(o.isEmpty()){
            while(!i.isEmpty()){
                o.push(i.pop());
                }
                
            
        }
        return o.peek();
    }
    
    public boolean empty() {
        return o.isEmpty() && i.isEmpty();
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
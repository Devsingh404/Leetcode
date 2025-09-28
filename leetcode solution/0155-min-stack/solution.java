class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class MinStack {
    Node min;
    Node top;

    public MinStack() {
        top = null;
        min = null;
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        
        if(min==null || val<=min.data){
            Node newMin = new Node(val);
            newMin.next = min;
            min = newMin;
        }
    }
    
    public void pop() {
        if(top == null) return;
        if(min.data == top.data){
            min = min.next;
        }
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return min.data;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

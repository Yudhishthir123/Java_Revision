import java.util.*;
class MyQueue {
    Stack<Integer>s1 = new Stack<>();
    Stack<Integer>s2 = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        while(!s1.isEmpty()){
            int topEle = s1.peek();
            s1.pop();
            s2.push(topEle);
        }
        s1.push(x);
        while(!s2.isEmpty()){
            int topEle = s2.peek();
            s2.pop();
            s1.push(topEle);
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

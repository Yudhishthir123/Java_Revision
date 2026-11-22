import java.util.*;
class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args){
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
    }
}
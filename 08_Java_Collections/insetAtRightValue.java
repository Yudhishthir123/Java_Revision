import java.util.ArrayDeque;
import java.util.Deque;

public class insetAtRightValue {
    static void insertAt(Deque<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int val = st.peek();
        if(val<x){
            st.pop();
            insertAt(st,x);
            st.push(val);
        }else{
            st.push(x);
            return;
        }
    }
    public static void main(String[] args){
        Deque<Integer> st = new ArrayDeque<>();
        insertAt(st,4);
        System.out.println(st);
    }
}

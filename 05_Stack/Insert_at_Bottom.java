import java.util.*;
public class Insert_at_Bottom {
    public static void helper(Stack<Integer> st, int val){
        if(st.empty()){
            st.push(val);
            return;
        }
        int topVal = st.peek();
        st.pop();
        helper(st,val);
        st.push(topVal);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int val = 55;
        helper(st,val);
        System.out.println(st);
    }
}

import java.util.ArrayDeque;
import java.util.Deque;

public class ascendingSortedStack {
    static boolean isSorted(Deque<Integer> st){
        if(st.size()<=1){
            return true;
        }
        int prevVal = st.peek();
        st.pop();
        int currVal = st.peek();
        boolean oneCase = (prevVal<=currVal);
        boolean recur = isSorted(st);
        st.push(prevVal);
        boolean finalAns = (oneCase && recur);
        return finalAns;
    }
    public static  void main(String[] args){
        Deque<Integer> st = new ArrayDeque<>();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        boolean ans = isSorted(st);
        System.out.println(ans);
    }
}

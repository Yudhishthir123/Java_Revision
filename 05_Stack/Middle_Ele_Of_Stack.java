import java.util.*;
public class Middle_Ele_Of_Stack {
    public static void printMiddleElementOfStack(Deque<Integer> stack,int count,int size){
        if(stack.isEmpty() || count == (size-1)/2){
            if(!stack.isEmpty()) {
                int middle = stack.peek();
                System.out.println("Middle Element of Stack : " + middle);
            }
            return;
        }
        stack.pop();
        count++;
        printMiddleElementOfStack(stack,count,size);
    }
    public static void main(String[] args){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        int count = 0;
        int size = stack.size();
        printMiddleElementOfStack(stack,count,size);
    }
}

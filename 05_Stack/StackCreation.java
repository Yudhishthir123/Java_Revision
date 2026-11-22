import java.util.*;
public class StackCreation {
    static class stack {
        private int[] arr;
        private int capacity;
        private int top;

        public stack(int capacity){
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }
        public void push(int value){
            if(top == capacity-1){
                System.out.println("Stack Overflow , cannot add element");
                return;
            }else{
                top++;
                arr[top] = value;
            }
        }

        public void po(){
            if(top == -1){
                System.out.println("Stack Underflow, cannot delete element");
                return;
            }else{
                arr[top] = -1;
                top--;
            }
        }

        public int peek(){
            if(top == -1){
                System.out.println("Stack is empty");
                return -1;
            }else{
                return arr[top];
            }

        }

        public int getSize(){
            return  top+1;
        }

        public int getCapacity(){
            return this.capacity;
        }

        public boolean isEmpty(){
            if(top == -1)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args){
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.getSize());
    }
}

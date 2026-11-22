import java.util.LinkedList;
import java.util.Queue;

public class Circular_Queue_Using_array {
    public static class circularQueue{

        int arr[];
        int front;
        int rear;
        int size;
        int capacity;
        public circularQueue(int n){
            arr = new int [n];
            capacity = n;
            size = 0;
            front = 0;
            rear = -1;
        }
        public boolean enqueue(int x){
            if(isFull()){
                return false;
            }else{
                rear = (rear+1)%capacity;
                arr[rear] = x;
                size++;
                return true;
            }
        }

        public int dequeue(){
            if(isEmpty()){
                return -1;
            }else{
                int del = arr[front];
                arr[front] = -1;
                front = (front+1)%capacity;
                size--;
                return del;
            }
        }

        public int getFront(){
            if(isEmpty()){
                return -1;
            }else{
                return arr[front];
            }
        }

        public int getRear(){
            if(isEmpty()){
                return -1;
            }else{
                return arr[rear];
            }
        }

        public boolean isEmpty(){
            if(size == 0){
                return  true;
            }else{
                return false;
            }
        }
        public boolean isFull(){
            if(rear == capacity-1){
                return true;
            }else{
                return  false;
            }
        }

        public int getSize(){
            return this.size;
        }
    }
    public static void main(String[] args){
        circularQueue q = new circularQueue(2);
        q.enqueue(1);
        q.enqueue(2);
        Queue<Integer> k = new LinkedList<>();
        System.out.println("Deleted Element in Queue : "+q.dequeue());
    }

}

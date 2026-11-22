public class Queue_Using_Array {
    public static  class MyQueue{
        int arr[];
        int front;
        int rear;
        int size;
        int capacity;
        public MyQueue(int n){
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
                rear++;
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
                front++;
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
        MyQueue q = new MyQueue(2);
        q.enqueue(1);
        q.enqueue(2);

    }
}

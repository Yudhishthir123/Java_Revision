import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}

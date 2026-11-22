import java.util.*;
public class QueueBasic {
    public static void main(String[] argc){
        Queue<Integer> q = new LinkedList<>();
        // insertion
        q.offer(10);
        q.offer(20);
        q.offer(30);
        // deletion
        System.out.println(q.poll());
        System.out.println(q);
        // peek
        System.out.println(q.peek());
    }
}

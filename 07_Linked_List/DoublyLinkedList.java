public class DoublyLinkedList {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
}

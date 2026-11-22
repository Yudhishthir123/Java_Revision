public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
     public SinglyLinkedList(){
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
             head = newNode;
         }
         size++;
     }

     public void insertAtTail(int data){
         Node newNode = new Node(data);
         if(head == null && tail == null){
             head = newNode;
             tail = newNode;
         }else{
             tail.next = newNode;
             tail = newNode;
         }
         size++;
     }

     public void insertAtPosition(int pos,int data){
         if(pos < 1 && pos > size+1){
             System.out.println("Cannot Insert the node ");
             return;
         }
         if(pos == 1){
             insertAtHead(data);
             return;
         }
         if(pos == size+1){
             insertAtTail(data);
             return;
         }
         Node prevnode = head;
         for(int i =1;i<=pos-2;i++){
             prevnode = prevnode.next;
         }
         Node newNode = new Node(data);
         newNode.next = prevnode.next;
         prevnode.next = newNode;
         size++;
     }

     public void printList(){
         Node temp = head;
         while(temp != null){
             System.out.print(temp.data+"->");
             temp = temp.next;
         }
         System.out.println();
     }

     public int getSize(){
         return size;
     }

     public boolean isEmpty(){
         return head == null;
     }

     public int getHead(){
         if(head == null)
             return -1;
         else
             return head.data;
     }

     public int getTail(){
         if(tail == null)
             return -1;
         else
             return tail.data;
     }

     public boolean search(int target){
         Node temp = head;
         while(temp != null){
             if(temp.data == target){
                 return true;
             }else{
                 temp = temp.next;
             }
         }
         return false;
     }

     public int findPosition(int target){
         Node temp = head;
         int count = 1;
         while(temp != null){
             if(temp.data == target){
                 return count;
             }else{
                 temp = temp.next;
                 count++;
             }
         }
         return -1;
     }

     public void updateAtPosition(int pos, int data){
         Node temp = head;
         if(pos< 1 || pos > size+1){
             System.out.println("cannot update at position");
             return;
         }
         for(int i=0;i<=pos-1;i++){
             temp = temp.next;
         }
         temp.data = data;
     }

     public boolean updateValue(int oldVal, int newVal){
         Node temp = head;
         while(temp != null){
             if(temp.data == oldVal){
                 temp.data = newVal;
                 return true;
             }
             temp = temp.next;
         }
         return false;
     }

     public void deleteHead(){
         if(head == null){
             System.out.println("List is already Empty!!!");
             return;
         }
         head = head.next;
         size--;
         if(head == null){
             tail = null;
         }
     }

     public void deleteTail(){
         if(head == null){
             System.out.println("Linked list is empty");
             return;
         }
         if(head == tail){
             head = null;
             tail = null;
             size = 0;
         }
         Node temp = head;
         for(int i=1;i<=size-2;i++){
             temp = temp.next;
         }
         temp.next = null;
         tail = temp;
         size--;
     }

     public void deleteAtPosition(int pos){
         if(pos < 1 || pos > size+1){
             System.out.println("Invalid position to delete");
             return;
         }
         if(pos == 1){
             deleteHead();
             return;
         }
         if(pos == size){
             deleteTail();
             return;
         }
         Node prev = head;

         for(int i=1;i<=size-2;i++){
             prev = prev.next;
         }
         Node curr = prev.next;
         Node forward = curr.next;

         prev.next = forward;
         curr.next = null;

         size--;
     }
     public boolean deleteVal(int tar){
         if(head == null){
             System.out.println("No Nodes to delete present in LinkedList");
             return false;
         }
         if(head.data == tar){
             deleteHead();
             return true;
         }
         Node prev = head;
         Node curr = head.next;

         while (curr != null){
             if(curr.data == tar){
                 Node forward = curr.next;
                 prev.next = forward;
                 curr.next = null;
                 if(tail == curr){
                     tail =prev;
                 }
                 size--;
                 return true;
             }else{
                 prev =prev.next;
                 curr = curr.next;
             }
         }
         return false;
     }

     public static void main(String[] args){
         SinglyLinkedList list = new SinglyLinkedList();
         list.insertAtHead(10);
         list.insertAtHead(20);
         list.insertAtTail(30);
         list.printList();
         System.out.println(list.search(20));
         System.out.println(list.findPosition(200));
         list.updateAtPosition(1,40);
         list.printList();
     }
}

public class listPalindrom {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public ListNode middleEle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null){
                fast = fast.next;
                if(fast != null){
                    fast = fast.next;
                    slow = slow.next;
                }
            }
            return slow;
        }
        public ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                ListNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }

        public boolean palindrom(ListNode head){
            ListNode list2 = middleEle(head);
            ListNode temp = head;

            while(temp.next != list2){
                temp = temp.next;
            }
            temp.next = null;

            ListNode head2 = reverseList(list2);

            ListNode temp1 = head;
            ListNode temp2 = head2;
            while(temp1 != null && temp2 != null ){
                if(temp1.val != temp2.val){
                    return false;
                }else{
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }
            return true;
        }
    }

}

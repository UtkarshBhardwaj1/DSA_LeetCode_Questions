//Reversing in group of 2
class Solution {
    public ListNode swapPairs(ListNode head) {
         if(head==null ||head.next==null) {
            return head;
        }

        ListNode previous=null;
        ListNode current=head;
        ListNode newHead=head.next;
        while(current!=null&&current.next!=null) {
            ListNode nextPair=current.next.next; 
            ListNode second=current.next; 
            second.next=current;
            current.next=nextPair;
            if(previous!=null) {
                previous.next=second;
            }
            previous=current;
            current=nextPair;
        }
        return newHead;
    }
}

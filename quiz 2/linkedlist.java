class node{
    int data;
    node next;
} 

public class linkedlist{
    public boolean hasCycle(node head){
        if (head == null){
            return false;
        }
        node slow = head;
        node fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }   
        return true;
    }

    
}
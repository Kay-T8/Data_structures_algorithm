class node{
    int data;
    node next;
} 
public node detectCycle(Node head) {
    node slow = head;
    node fast = head;

    while(fast != null || fast.next != null){
        fast= fast.next.next;
        slow = slow.next;

        if(slow = fast){
            while (head != slow){
                head = head.next;
                slow = slow.next;
            }
            return slow;
        }
    }
    return null;
}
public class main{
    public static  void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  head.next;
        System.out.println("Detect cycle in the list: " + detectCycle (head));
    }
}
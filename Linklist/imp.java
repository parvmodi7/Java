import java.util.HashSet;

public class imp {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // 1. addFirst
    public void addFirst(int data) {

        Node newNode = new Node(data);
size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // 2. print all
   public static void print(Node head) {

    Node temp = head;

    if (temp == null) {
        System.out.println("empty");
        return;
    }

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();
}

    // 3. detect a cycle 
public static boolean detectCycle() {

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true;
        }
    }

    return false;
}

public static int size( )
{
    Node point=head;
    int size=0;
    while(point!=null)
    {
        size++;
         point=point.next;
    }
    return size;

}


public static void removeDupli()
{
 HashSet <Integer> set=new HashSet<>();
Node curr = head ;
while(curr != null && curr.next!=null)
{
    set.add(curr.data);
    if(set.contains(curr.next.data))
    {
        curr.next=curr.next.next;
    }
    else{
        curr=curr.next;
    }
}

}

public static Node merge(Node head1,Node head2)
{
    Node dummy = new Node(-1);
    Node temp = dummy;
    while(head1!=null && head2 !=null)
    {
        if(head1.data<=head2.data)
        {
            temp.next=head1;
            head1=head1.next;
        }
        else
        {
            temp.next=head2;
            head2=head2.next;
        }
        temp = temp.next;
    }
    if(head1!=null)
    {
        temp.next=head1;
    }
    else
    {
        temp.next=head2;
    }
    return dummy.next;
}
  public static void main(String args[]) {

    // imp list = new imp();

    // list.head = new Node(0);
    // list.head.next = new Node(1);
    // list.head.next.next = new Node(2);
    // list.head.next.next.next = new Node(3);
    // list.head.next.next.next.next = new Node(3);

    // list.addFirst(9);
    //  System.out.println("Before:");
    //     print();

    //     removeDupli();

    //     System.out.println("After:");
    //     print();
    Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node result = merge(head1, head2);

        print(result);

}
}
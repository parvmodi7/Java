package Stack;

public class practise {

    // Make Node static
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node
    static Node head;

    public static void addFirst(String data)
    {
        Node newNode=new Node(data);
       if(head==null){
        head=newNode;
        return;}
        newNode.next=head;
        head=newNode;

    }

    // Reverse the linked list
    public static void reverse() {
        if (head == null || head.next == null) {
            
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;
    }

    // Print the linked list
    public static void print() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }


 public static void addLast(String data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node lastNode = head;

    while (lastNode.next != null) {
        lastNode = lastNode.next;
    }

    lastNode.next = newNode;
}
    public static void main(String[] args) {

        // Create linked list
        addFirst("Hii");
        addFirst("I");
       addFirst("am");
      addFirst("Parv");

        System.out.println("Original Linked List:");
        print();

        reverse();

        System.out.println("Reversed Linked List:");
        print();
    }
}
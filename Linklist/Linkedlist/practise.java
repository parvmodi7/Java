package Linkedlist;

public class practise {
    // Custom Node structure
    public static class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head tracker for the custom list
    public static Node head;

  

    // Print method to traverse custom list
    public static void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addLast(Integer data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;

    }

    // public static void reverse()
    // {
    //     Node prev=null;
    //     Node curr=head;
    //     while(curr!=null)
    //     {
    //       Node next= curr.next;
    //       curr.next=prev;//logic

    //       prev=curr;
    //       curr=next;
    //     }
    //     head.next=null;
    //     head=prev;
    // }

//     public boolean palindrome()
//     {
//          //1. middle
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null)
//         {
//             fast=fast.next.next;
//             slow=slow.next;
//         }
        
//         //2.reverse
//          Node prev=null;
//         Node curr=slow.next;
//         while(curr!=null)
//         {
//           Node next= curr.next;
//           curr.next=prev;//logic

//           prev=curr;
//           curr=next;
//         }
//          Node left=head;
// Node right=prev;



    //3.check
    // while(right!=null)
    // {
    //     if(right.data!=left.data)
    //     {
    //         return false;
    //     }
    //     right=right.next;
    //     left=left.next;
    // }
    // return true;
    // }

    // public static void cycle()
    // {
    //     Node slow=head;
    //     Node fast=head;
    //     while(fast!=null && fast.next!=null)
    //     {
    //         fast=fast.next.next;
    //         slow=slow.next;
    //         if(slow==fast)
    //         {
    //             System.out.print("cycle is there");
    //         }
    //         else
    //         {
    //             System.out.print("cycle is not there");
    //         }
    //     }

    // }
   

    public static void main(String args[]) {
        // Create an instance of our custom list class
        practise list = new practise();
        
        // Use our custom methods
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        // list.addFirst(5);
        // list.addFirst(6);
        
        // Print the custom list
        print(); 
        reverse();
print();
    }
}

import java.util.*;

public class Javabasic {

    static class LL {

        Node head;

        class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
            }
        }

        public void addFir(String data) {

            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void printl() {

            if(head == null) {
                System.out.println("List is empty");
                return;
            }

            Node currNode = head;

            while(currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }

            System.out.println("null");
        }

        public void addlast(String data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head=newNode;
            }
            Node currNodel=head;
            while(currNodel.next != null)
            {
                currNodel=currNodel.next;
            }   
            currNodel.next=newNode;


        }

        public void firdele(String data)
        {
                if(head==null)
                {
                    System.out.print("list is emtly");
                    return;
                }
            head=head.next;
        }
        
        public void lastdel(String data)
        {
           if(head==null)
           {
            System.out.print("list is emty");
           }
           if(head.next==null)
           {
            head=null;
            return;

           }
            Node secNode=head;
            Node lastNode=head.next;
            while(lastNode.next!=null)
            {
                secNode=secNode.next;
                lastNode=lastNode.next;
            }
 secNode.next=null;
        }

        public void reverseLin()
        {
            Node prevNode=head;
           Node currNode=head.next;
           while(currNode!=null)
           {
            if(head==null || head.next==null)
            {
                return;
            }
              Node nextNode=currNode.next;
              currNode.next=prevNode;

              //update
              prevNode=currNode;
              currNode=nextNode;
           }
           head.next=null;
           head = prevNode;

        }

        public void Deletenth()
        {
            int n = 2;
            int size=0;
            Node curr=head;
            while(curr!=null)
            {
                curr=curr.next;
                size++;
            }
            // System.out.println(size);
            int i = size-n;
            Node prev=head;
            int j=1;
            while(j<i)
            {
                prev=prev.next;
            }
            prev.next=prev.next.next;
            // return head;
        }

        public void deletemnode(String data)
        {
            // Node slow=head;
            // Node fast=head;
            
            // while(fast!=null && fast.next!=null)
            // {
            //  slow =  head.next;
            //  fast=head.next.next;
            // }
 int size=0;
            Node curr=head;
            while(curr!=null)
            {
                curr=curr.next;
                size++;
            }
            
            int limit=size/2;
            Node prev=head;
            int i =1;
           while(i<limit)
           {
prev=prev.next;
           }
           prev.next=prev.next.next;
        }

    

    }
  

    
    // MAIN METHOD HERE
    public static void main(String args[]) {

        // LinkedList <String> list=new LinkedList<String>();
        LL list = new LL();

        list.addFir("am");
        list.addFir("I");
list.addlast("parv");
        list.printl();
        list.reverseLin();
        list.printl();
        // list.size();

    }
}
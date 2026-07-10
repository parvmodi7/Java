package Stack;

public class push {
    static class Node{
        int data;
        Node next;

    public Node(int data)
    {
        this.data=data;
        next=null;
    }

    static class Stack{
       public static Node head;
        public static boolean isEmplty()
        {
            return head==null;
        }

        public static void push(int data)
        {
             Node newNode=new Node(data);
            if(isEmplty())
            {
               head=newNode;
               return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(int data)
        {
            if(isEmplty())
            {
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;

        }
        public static int peek(int data)
        {
            if(isEmplty())
            {
                return -1;
            }
            return head.data;
        }
    }

    }


}

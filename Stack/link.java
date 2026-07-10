package Stack;

public class link {

    public static class Node {
      int data ;
      Node next;
      Node (int data)
      {
        this.data=data;
        this.next=null;
      }
    }
    static class Stack {
      static Node head = null;

    public static boolean Empty()
      {
        return head==null;
      }

    public static void push(int data)
    {
        Node newNode=new Node(data);
   
newNode.next=head;
head=newNode;
    }
  
    public static int remove()
    {
        if(Empty())
        {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    public static int peek()
    {
    if(Empty())
    {
        return -1;
    }
    return head.data;
    }
    }

     public static void main(String args[])
  {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    while(!s.Empty())
    {
       System.out.println(s.peek());
      s.remove(); 
    }
  }
}

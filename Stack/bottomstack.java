package Stack;

import java.util.Stack;

public class bottomstack {

    public static void printbottom(Stack <Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        printbottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s)
    {
      if(s.isEmpty())
      {
        // s.push(data);
        return;
      }

        int top = s.pop();
      reverseStack(s);
      printbottom(s, top);
    }

    public static void printStack(Stack <Integer> s)
    {
        while(!s.isEmpty())
        {
          int top= s.pop();
          System.out.println(top);
        }
    }
    public static void main(String args[])
    {

        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        reverseStack(s); 
        printStack(s);

    }
}

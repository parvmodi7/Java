package Stack;

import java.util.ArrayList;

public class test {
    static class Stack {
        static ArrayList<Integer>list=new ArrayList<>();
        
        public static boolean Empty() // check is empty
        {
            return list.size()==0;
        }
        public static void push(int data) //Add the number in the top
        {
         list.add(data);
        }
        public static int pop()
        {
           int top = list.get(list.size()-1);
           list.remove(list.size()-1);
           return top;
        }
        public static int peek()
        {
          int top = list.get(list.size()-1);
          return top;
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
      s.pop(); 
    }
  }
}

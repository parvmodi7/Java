package Stack;

import java.util.Stack;

public class Duplicateparanthsis {

    public static boolean isDuplicate(String str)
    {
        Stack <Character> s=new Stack<>();
        for(int i =0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //closing 
            if(ch=='(')
            {
                int count =0;
               while(ch==')')
                {
                    s.pop();
                    count++;
                } 
                if(count<1)
                {
                    return true;
                }
                else
                {
                    s.pop();
                }
               
            }
            else
            {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String str="(a+b)";
        System.out.print(isDuplicate(str));
    }
}

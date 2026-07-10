package Stack;
import java.util.*;
public class nextgreaterElemnt {
    public static void main(String args[])
    {
        int arr[]={6,8,0,1,3};
        Stack <Integer> s=new Stack<>();
        int nextGen[]= new int[arr.length];

        for(int i = arr.length-1 ;i>=0;i--)
        {
            // 1. while loop condition isme ye check kiya ki empty to nhi hai aur aur current array ka element bada hai jo element hai abhi stack mein unko pop krodo unka koi kam nhi hai ...aur yaha hum right to left ja rhe hai aur (yaha bus index store kar rhe hai !!!!)
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }

            // 2.condition -. (yaha ye check horh hai ki sare chote elements hata diye to agar stack kahli hai too -1 return kar do aur agar stack mein kuch bada hai too usko save kardo )
            if(s.isEmpty())
            {
                nextGen[i]=-1;
            }
            else
            {
                nextGen[i]=arr[s.peek()];
            }

            // 3.aur element push krte jao bada element 
            s.push(i);

        }

        for(int i=0;i<nextGen.length;i++)
        {
            System.out.println(nextGen[i]);
        }

    }
}

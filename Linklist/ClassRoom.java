import java.util.*;

public class ClassRoom {
    
    public static void main(String[] args) {
        //create
        LinkedList <Integer> ll=new LinkedList<>();
        ll.addFirst(0);
        ll.add(1);
        ll.add(2);
        ll.addLast(3);
        // System.out.println(ll);
        // Collections.reverse(ll);
        System.out.println(ll);

        int slow =0;
        int fast =0;
        while(fast < ll.size() && fast +1 < ll.size())
        {
            if(slow==fast)
            {
                System.out.println("here is a cycle");
            }
            slow++;
            fast +=2;
        }
        
        System.out.print(slow);

    }
}

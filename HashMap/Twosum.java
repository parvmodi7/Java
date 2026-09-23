package HashMap;

import java.util.HashMap;

public class Twosum {
    
    public static void main(String args[])
    {
        int arr[]={2,7,11,15};
        int target=9;
        HashMap <Integer,Integer > map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int left=target-arr[i];

            if(map.containsKey(left))
            {
                System.out.print(map.get(left)+ " " + i);
                return ;
            }
            map.put(arr[i],i);
        }

    }
}

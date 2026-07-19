package Queue; 
import java.util.*; 

public class firsthalfjoin { 
    public static void main(String args[]) { 
        Queue <Integer> arr1 = new LinkedList<>(); 
        arr1.add(1); 
        arr1.add(2); 
        arr1.add(3); 
        arr1.add(4); 
        arr1.add(5); 
        arr1.add(6); 
        arr1.add(7); 
        arr1.add(8); 
        arr1.add(9); 
        arr1.add(10); 
        
        Queue <Integer> arr2 = new LinkedList<>(); 
        
        // Fix: Store the initial half-size in a variable
        int halfSize = arr1.size() / 2; 
        
        for(int i = 0; i < halfSize; i++) { 
            int a = arr1.remove(); 
            arr2.add(a); 
        } 
        while(!arr2.isEmpty())
        {
           int t= arr2.remove();
            arr1.add(t);
            int j=arr1.remove();
            arr1.add(j);
        }
        while(!arr1.isEmpty())
        {
            System.out.print(arr1.peek());
            arr1.remove();
        }
    } 
}

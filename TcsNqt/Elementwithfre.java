package Tcsnqt;
import java.util.*;

public class Elementwithfre{


    public static int freq(int nums[])
    {
       int n=nums.length;
       int k=0;
       Arrays.sort(nums);
       for(int i=0;i<n;i++)
       {
        if(nums[i]==nums[i+1])
        {
            k++;
            
        }
       }
    }
    public static void main(String args[])
    {
        int nums[]={1,2,2,3,1,4};
        freq(nums);
    }
}
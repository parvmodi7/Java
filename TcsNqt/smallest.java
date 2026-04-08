package Tcsnqt;

public class smallest {
    public static void main(String args[])
    {
        int arr[]={2,5,1,3,0};
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
{
    if(min>arr[i])
    {
        min=arr[i];
    }
}
System.out.print(min);
    }
}

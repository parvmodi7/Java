import java.util.*;

public class Javabasic {
    public static void main(String[] args) {
       int a = 0;
       int b = 1;
       int n=1;
       int c=0;
       num(a,b,n,c);
    }
    
    public static void num(int a, int b , int n,int c)
    {
        if(n>3)
        {
            System.out.println(c);
            return;
        }
      c = a+b;
      num(b,c,n+1,c);

    }
} 
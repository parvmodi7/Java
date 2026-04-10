import java.util.Arrays;

public class Javabasic {
    public static void main(String[] args) {
String s="abcdefgh";
int vowels = 0;
int con=0;
for(int i=0;i<s.length();i++)
{
    if(s.charAt(i)=='a'||s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='e')
    {
           vowels++;
    }
    else
    {
     con++;
    }
}
System.out.print(vowels);
System.out.print(con);




   
    }
} 
package Mathematics;
import java.util.*;
public class palindromeNumber 
{
    static boolean isPalindrome(int num)
    {
        int rev=0;
       
        for(int temp=num;temp!=0;temp=temp/10)
        {
            rev*=10;
            rev+=temp%10;
        }
            
        return (rev==num);
    }
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num= sc.nextInt();
        System.out.println("No. is Palindrome: "+isPalindrome(num));
        sc.close();
    }
}

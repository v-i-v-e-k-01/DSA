package Mathematics;
import java.util.*;
public class TrailingZeroFact {
    static int countTrailingZero(int num)
    {
        int res=0;
        for(int i=5; i<=num;i*=5)
        {
            res=res+(num/i);
        }
        return res;
    }


    public static void main(String args[])
    {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("No. of Trailing zeroes: "+countTrailingZero(num));
        sc.close();
    }
}

package Mathematics;
import java.util.*;
public class lcm {

    static int lcmEuclidean(int a, int b)
    {
        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("LCM : "+ lcmEuclidean(a, b));
        sc.close();
    }
}

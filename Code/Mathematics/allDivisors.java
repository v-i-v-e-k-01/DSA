package Mathematics;
import java.util.*;
public class allDivisors {

    static void printDivisorsNaive(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print( i +" ");
            }
        }
        System.out.println();
    }

    static void printDivisorsEfficient(int num)
    {
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print( i +" ");
                if(i!=num/i)
                {
                    System.out.print( num/i +" ");
                }
            }
        }
        System.out.println();
    }

    static void  printDivisorsOrdered(int num)
    {
        int i;
        for(i=1;i*i<num;i++)
        {
            if(num%i==0)
            {
                System.out.print( i +" ");
            }
        }

        for(;i>=1;i--)
        {
            if(num%i==0)
            {
                System.out.print( num/i +" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("All divisors (Naive Solution): ");
        printDivisorsNaive(num);
        System.out.println("All divisors (Efficient Solution): ");
        printDivisorsEfficient(num);
        System.out.println("All divisors (Efficient Ordered Solution): ");
        printDivisorsOrdered(num);
        sc.close();
    }
}
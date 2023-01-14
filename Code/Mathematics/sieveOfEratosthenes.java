package Mathematics;
import java.util.*;
public class sieveOfEratosthenes
{
    static void sieveNaive(int num)
    {
        for(int i=2;i<=num;i++)
        {   
            if(checkPrime.isPrime(i))
            {
                System.out.print( i + " ");
            }
        }
        System.out.println();
    }

    static void sieveEfficient(int num)
    {
        boolean isPrimeArray[]= new boolean[num+1];
        Arrays.fill(isPrimeArray, true);

        for(int i=2; i*i<=num; i++)       // i*i<=num here
        {
            if(isPrimeArray[i])
            {
                for(int j=2*i;j<=num;j+=i)
                    isPrimeArray[j]=false;
            }
        }

        for(int i=2;i<=num;i++)
        {
            if(isPrimeArray[i])
                System.out.print( i +" ");
        }
        System.out.println();
    }

    static void seiveOptimised(int num)
    {
        if(num<=1) return;
        boolean isPrimeArray[]=new boolean[num+1];
        Arrays.fill(isPrimeArray, true);

        for(int i=2;i*i<=num;i++) 
        {
            if(isPrimeArray[i])
            {
                for(int j=i*i; j<=num; j+=i)     // j=i*i here
                    isPrimeArray[j]=false;
            }
        }

        for(int i=2;i<=num;i++)
        {
            if(isPrimeArray[i]) 
                System.out.print( i + " ");
        }
        System.out.println();
    }

    static void seiveOptimisedSimplifiedCode(int num)
    {
        if(num<=1) return;
        boolean isPrimeArray[]= new boolean[num+1];
        Arrays.fill(isPrimeArray, true);

        for(int i=2; i<=num; i++)     // reverted to i<=num again to remove  for loop for print
        {
            if(isPrimeArray[i])
            {
                System.out.print( i + " "); // print statement included
                for(int j=i*i;j<=num;j+=i)
                    isPrimeArray[j]=false;
            }
        }
    }

    public static void main(String args[]){

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Prime numbers below "+num+" are (Naive Solution): ");
        sieveNaive(num);
        System.out.println("Prime numbers below "+num+" are (Efficient Solution): ");
        sieveEfficient(num);
        System.out.println("Prime numbers below "+num+" are (Optimised Solution): ");
        seiveOptimised(num);
        System.out.println("Prime numbers below "+num+" are (Optimised Simplified Solution): ");
        seiveOptimisedSimplifiedCode(num);
        
        sc.close();
    }
}
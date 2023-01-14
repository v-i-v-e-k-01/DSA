package Mathematics;

import java.util.Scanner;

public class checkPrime {
    
    static boolean isPrimeNaive(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i<num;i++)
        {    
            if(num%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrime(int num)
    {
        if(num==1) return false;
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrimeOptimised(int num)
    {
        if(num==1) return false;

        if(num==2 || num==3) return true;

        if(num%2==0 || num%3==0)
            return false;

        for(int i=5; i*i<=num; i=i+6)
        {
            if(num%i==0 || num%(i+2)==0)
                return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The number is Prime (Naive Solution): "+isPrimeNaive(num));
        System.out.println("The number is Prime (Efficient Solution): "+isPrime(num));
        System.out.println("The number is Prime (Optimised Efficient Solution): "+isPrimeOptimised(num));
        sc.close();
    }
}

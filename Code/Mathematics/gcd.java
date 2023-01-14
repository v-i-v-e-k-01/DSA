package Mathematics;

import java.util.Scanner;

public class gcd {

    static int gcdNaive(int a, int b)
    {
        int res=Math.min(a, b);
        while(res>0)
        {
            if(a%res==0 && b%res==0)
                break;
            res--;
        }
        return res;
    }

    static int gcdEuclidean(int a, int b)
    {
        while(a!=b)
        {
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    static int gcdEucOptimised(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcdEucOptimised(b,a%b);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Naive Solution: "+gcdNaive(a, b));
        System.out.println("Solution using Euclidean Algo.: "+gcdEuclidean(a, b));
        System.out.println("Eucl. Algo. Optimised Solution: "+gcdEucOptimised(a, b));
        sc.close();
    }
}

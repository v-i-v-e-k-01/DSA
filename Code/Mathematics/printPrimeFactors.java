package Mathematics;
import java.util.*;
public class printPrimeFactors {

    static void PrimeFactorsNaive(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(checkPrime.isPrime(i))
            {
                int x=i;
                while(num%x==0)
                {
                    System.out.print(i + " ");
                    x=x*i;
                }
            }
        }
        System.out.println();
    }
    //*************************************************** 
    static void PrimeFactorsEfficient(int num)
    {
        if(num<=1) return;
        for(int i=2; i*i<=num; i++ )
        {
            while(num%i==0)
            {
                System.out.print(i + " ");
                num=num/i;
            }
        }
        if(num>1)   System.out.print(num + " ");
        System.out.println();
    }

    //****************************************************
    static void PrimeFactorsOptimised(int num)
    {
        if(num<=1) return;
        
        while(num%2==0)
        {
            System.out.print(2 + " ");
            num=num/2;
        }

        while(num%3==0)
        {
            System.out.print(3 + " ");
            num=num/3;
        }

        for(int i=5; i*i<=num; i+=6)
        {
            while(num%i==0){
                System.out.print(i + " ");
                num=num/i;
            }

            while(num%(i+2)==0){
                System.out.print( i+2 + " ");
                num=num/(i+2);
            }
        }
        if(num>3)
        {
            System.out.print(num);
        }
        System.out.println();
    }


    public static void main(String args[]) 
    {   
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Prime factors (Naive Method): ");
        PrimeFactorsNaive(num);
        System.out.println("Prime factors (Efficient Method): ");
        PrimeFactorsEfficient(num);
        System.out.println("Prime factors (Optimised Efficient Method): ");
        PrimeFactorsOptimised(num);

        sc.close();
    }
}

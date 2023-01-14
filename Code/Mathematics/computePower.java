package Mathematics;

import java.util.Scanner;

public class computePower {

    static int computePowerNaive(int num, int power) 
    {
        int res=1;
        for(int i=0;i<power;i++)
            res=res*num;
        return res;
    }

    static int computePowerEfficient(int num, int power)
    {
        if(power==0)    return 1;          

        int temp= computePowerEfficient(num, power/2);    
        temp = temp * temp; // when power is odd, it is rounded off to smaller number, thus to compensate it, the if else statement written

        if(power%2==0)
            return temp;
        else
            return temp*num;
        
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number and power: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        System.out.println(num+" to the power "+power+" is (Naive Solution): " + computePowerNaive(num, power));
        System.out.println(num+" to the power "+power+" is (Efficient Solution): " + computePowerEfficient(num, power));
        
        sc.close();
    }
}

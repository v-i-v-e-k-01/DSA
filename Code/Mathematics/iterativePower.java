package Mathematics;

import java.util.Scanner;

public class iterativePower {

    static int computerPowerIterativeMethod(int num, int power)
    {
        int res=1;

        while(power>0)
        {
            if(power%2 != 0)
                res=res*num;    
            num=num*num; 
            power=power/2;  // OR power=power>>1 bitwise right shift; both similar to dividing number by 10 in normal number format
        }

        return res;
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number and power: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        System.out.println(num+" to the power "+power+" is (Iterative Solution): " + computerPowerIterativeMethod(num, power));

        sc.close();
    }
}

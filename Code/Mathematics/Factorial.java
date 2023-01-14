package Mathematics;
import java.util.*;

public class Factorial {
    // Iterative approach
    static int FactIter(int num)
    {
        int res=1;
        int temp=2;
        while(temp<=num)
        {
            res=res*temp;
            temp++;
        }
        return res;
    }

    // Recursive approach
    static int FactRec(int num)
    {
        if (num==1)
            return num;
        return num*FactRec(num-1);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Factorial (iterative method): "+FactIter(num));
        System.out.println("Factorial (recursive method): "+FactIter(num));
        sc.close();
    }
}

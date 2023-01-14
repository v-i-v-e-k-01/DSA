package Mathematics;
import java.util.*;

class countDigits
{
    static int  count(int num)
    {
        int count=0;
        for(int i=num;i!=0;i=i/10)
        {
            count++;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("No. of Digits in given number: "+count(num));
        sc.close();
    }
}

//OR
    //	static int countDigits(int x)
	// {
	// 	int res = 0;

	// 	while(x > 0)
	// 	{
	// 			x = x / 10;

	// 			res++;
	// 	}	

	// 	return res;
	// }
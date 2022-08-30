import java.util.Scanner;
import java.util.Scanner.*;
public class PrimeUptoN {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int low=ob.nextInt();
        int high=ob.nextInt();
        for(int i=low;i<=high;i++)
        {
            int flag=0;
            for(int j=2;j*j<=i;j++)//j*j
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
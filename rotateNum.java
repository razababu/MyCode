import java.util.Scanner;
import java.util.Scanner.*;
public class rotateNum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int number =ob.nextInt();// take a number
        int k= ob.nextInt(); //take a number for rotate the number upto
        // Count th digit of the number
        int temp=number;
        int nod=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        //special case if k is very high
        k=k%nod;
        //if k is negative
        if(k<0)
        {
            k=k+nod;//if k=-2 and digit will 5 then k = 3 and rotate number upto 3 digit
        }

        //here we need divisor and multiplier
        int div=1;
        int mult=1;
        for(int i=1;i<=nod;i++)
        {
            if(i<=k)
            {
                div=div*10;//if k=2 then div=100
            }
            else
            {
                mult=mult*10;//and mult have multiplied until the count of digit end
            }
        }
        int q=number/div;
        int rem=number%div;
         /*------------------------*/
        int rotateNum=rem*mult+q;
        System.out.println(rotateNum);
    }
}

import java.util.Scanner;
import java.util.Scanner.*;
public class inverseOfNum {
    public static void main(String[] args) {
        System.out.println("Enter Number to find Inverse ");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        int inverse=0;
        int  originalPlace=1;
        while(num!=0)
        {
            int originalDigit=num%10;
            int invertedPlace=originalDigit;
            int invertedDigit=originalPlace;
            inverse=inverse+invertedDigit*(int)Math.pow(10,invertedPlace-1);
            num=num/10;
            originalPlace++;
        }
        System.out.println("Inverse of "+num+" is "+inverse);
    }
}

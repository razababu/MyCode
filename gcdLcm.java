import java.util.Scanner;
import java.util.Scanner.*;

public class gcdLcm {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Num1 : "); int num1=ob.nextInt();
        System.out.print("Num2 : "); int num2= ob.nextInt();
        int On1=num1;//safe original value of both input value for find lcm
        int On2=num2;
        while(num1%num2!=0)//run until rem=0
        {
            int rem=num1%num2;//find rem
            num1=num2;//now num1 = dividend
            num2=rem;// num2= divisor
        }
        int gcd=num2;// now rem=0 then the last divisor i.e - num2 is gcd
        System.out.println("GCD = "+gcd);
        //for LCM
        int lcm=(On1*On2)/gcd;//formula of finding lcm of two numbers
        System.out.println("LCM = "+lcm);
    }
}

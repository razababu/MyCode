
import java.util.Scanner;
import java.util.Scanner.*;
public class digitOfNum {
    public static void main(String[] args) {
      Scanner ob=new Scanner(System.in);
      int num=ob.nextInt();
      int count=0;
      int temp=num;//
      while(temp!=0)
      {
          temp=temp/10;//return quotient
          count++;
      }
        System.out.println(count);//number of digit in number
      int div=(int)Math.pow(10,count-1);//divisor for divide number.
      while(div != 0)
      {
          int quotient=num/div;
          System.out.println(quotient);
          num=num%div;//store remainder in num again and again till divisor is equal to zero
          div=div/10;//divisor become less by one zero 10000 to 1000
      }
    }
}

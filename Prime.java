import java.util.Scanner;
import java.util.Scanner.*;
public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t=scn.nextInt();//test case means for how many numbers it's print prime

      for(int i=0;i<=t;i++)
      {
          int n=scn.nextInt();
          int flag=0;
          for(int j=2;j<n;j++)
          {
              if(n%j==0)
              {
                  flag++;
              }
          }
          if (flag>=1)
          {
              System.out.println("not  prime");
          }
          else
          {
              System.out.println(" Prime");
          }
      }

    }
}

public class FibonacciNum {
    public static void main(String[] args) {
        int num=10;
        int a=0,b=1,c;
        for(int i=0;i<=num;i++)
        {

            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}

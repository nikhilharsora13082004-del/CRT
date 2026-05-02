import Java.Util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
System.out.println("Enter how many digits you want to print");
        int n=scanner.nextInt();
        int t1=0,t2=1;
        int sum;
        for(int i=1;i<=n;i++){
            System.out.print(t1);
            sum=t1+t2;
            t1=t2;
            t2=sum;
    }
}

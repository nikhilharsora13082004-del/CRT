import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("How many digits you  wants: ");
        n=scanner.nextInt();
        int t1=0,t2=0,t3=1,sum;
        for(int i=1;i<=n;i++){
            System.out.print(t1);
            sum=t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=sum;
        }
    }
}

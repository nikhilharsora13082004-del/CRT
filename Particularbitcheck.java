import java.util.Scanner;
public class Particularbitcheck {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no. ");
        int a=scanner.nextInt();
        System.out.println("Enter which bit you want to check: ");
        int b=scanner.nextInt();
        // right shift so that bit reaches to rightmost bit
        a=a>>(b);
        if((a&1)%2==0){
            System.out.println("The bit is 1");
        }
        else System.out.println("The bit is 0");
    }
}

import java.util.Scanner;

public class ParticularBitChange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no. ");
        int a=scanner.nextInt();
        System.out.println("Enter which bit you want to check: ");
        int b=scanner.nextInt();
        // right shift so that bit reaches to rightmost bit
        a=a>>(b);
        if((a&1)%2==0){
            a=a&1;
            //System.out.println("The bit is 1");
        }
        else {
            a=a|1;
          //  System.out.println("The bit is 0");
        }
    }
    }


import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number :");
        a=scanner.nextInt();
        System.out.println("Enter second number: ");
        b=scanner.nextInt();
        System.out.println("Enter third number :");
        c=scanner.nextInt();
        System.out.println("a="  +a+" b= "+b+" c="+c);
       // a=b-a+(c=a)-c+(b=c);// wrong
        // three numbers
        a=b-c+(b=c)+-a+(c=a);
       // a=b-a+(b=a);
        System.out.println("After swapping \n a="+a+" b= "+b+" c= "+c);
    }
}

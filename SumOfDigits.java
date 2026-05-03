package LOOP;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,oldn;
        System.out.println(" Enter any number: ");
        n=scanner.nextInt();
        oldn=n;
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits of number "+oldn+" is "+sum);
    }
}

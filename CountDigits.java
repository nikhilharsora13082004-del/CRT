package LOOP;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,oldn;
        System.out.println(" Enter any number: ");
        n=scanner.nextInt();
        oldn=n;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("No. of digits in number "+oldn+"are : "+count);
    }
}

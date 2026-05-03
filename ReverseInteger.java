package LOOP;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println(" Enter any number: ");
        n=scanner.nextInt();
        int l;
        int rev=0;
        while(n!=0){ // Extracting last digit till number becomes 0
            l=n%10;
            n=n/10; // reducing n
            // now we need one more variable to store reversed value becoz n i changing we can't use it
            // declare rev above
            //rev=rev+l*10; wrong
            rev=rev*10+l;
        }
        System.out.println("Reverse of the number is "+rev);
    }
}

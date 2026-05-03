package LOOP;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,oldn;
        System.out.println(" Enter any number: ");
        n=scanner.nextInt();
        oldn=n;
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
        if(oldn==rev){
            System.out.println("The number is a palindrome");
        } else System.out.println("The number is not a palindrome");
    }
}

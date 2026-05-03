package LOOP;

import java.util.Scanner;

public class PowerPofNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int n;
        System.out.println(" Enter any number: ");
        n=scanner.nextInt();
        System.out.println("Which power you want to calculate:");
        int p=scanner.nextInt();
        int t=1;
        for(int i=1;i<=p;i++){
            t=t*n;
        }
        System.out.println("The "+p+" th power of the number "+n+" is "+t);
    }
}

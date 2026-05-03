package LOOP;

import java.util.Scanner;

public class MenuCard {
    public static void main(String[] args) {
        int ch;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter any number 0. exit 1. Add\n 2.Subtract \n 3. Multiplication \n 4. Division \n 5.Modulus ");
            ch=scanner.nextInt();
            switch (ch){
                case 0->{
                    System.out.println("exit.");
                }

                case 1->{
                    System.out.println("Enter two numbers");

                    int a=scanner.nextInt(),b=scanner.nextInt();
                    System.out.println(a+b);
                    break;}
                case 2->{
                    System.out.println("Enter two numbers");

                    int a=scanner.nextInt(),b=scanner.nextInt();
                    System.out.println(a-b);
                    break;}
                case 3->{
                    System.out.println("Enter two numbers");

                    int a=scanner.nextInt(),b=scanner.nextInt();
                    System.out.println(a*b);
                    break;}
                case 4->{
                    System.out.println("Enter two numbers");

                    int a=scanner.nextInt(),b=scanner.nextInt();
                    System.out.println(a/b);
                    break;}
                case 5->{
                    System.out.println("Enter two numbers");

                    int a=scanner.nextInt(),b=scanner.nextInt();
                    System.out.println(a%b);
                    break;}
                default->
                    System.out.println("Invalid input!\n Please enter a valid input");
            }
        }while(ch!=0);
    }
}

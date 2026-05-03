package LOOP;
import java.util.Scanner;
import java.util.Scanner.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Enter any number: ");
         n=scanner.nextInt();
         boolean flag=true;
        for(int i=2;i<=(n+1)/2;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(n==0){
            System.out.println("Number is neither prime nor non prime"); return;
        }
        if(flag==true){
            System.out.println("number is a prime number");
        }else System.out.println("Number is not primme");
    }
}

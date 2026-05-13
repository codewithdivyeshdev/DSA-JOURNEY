package Day_11;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0,mul=0;
        int original=n;
        while(n!=0){
            mul=n%10;
          sum=sum*10+mul;


            n/=10;
        }
        int total =sum+original;
        System.out.println(sum);
        System.out.println(total);

    }
}

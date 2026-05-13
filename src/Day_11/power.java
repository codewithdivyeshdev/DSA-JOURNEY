package Day_11;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int p=1;
        for(int i=1;i<=b;i++){
            p*=n;


        }
        System.out.println(p);
    }
}

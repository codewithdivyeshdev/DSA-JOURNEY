package Day_10;

import java.util.Scanner;

public class greatestOFthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int x=sc.nextInt();
        System.out.println("enter second number:");
        int y=sc.nextInt();
        System.out.println("enter third number:");
        int z=sc.nextInt();
        if(x>=y&&x>=z){
            System.out.println(x);
        }
        else if(y>=x&&y>=z){
            System.out.println(y);
        }
        else if(z>=x&&z>=y){
            System.out.println(z);
        }
        else System.out.println("invalid");
    }
}

package Day_10;

import java.util.Scanner;

public class integerORnot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive number :");
        double n=sc.nextDouble();
        int x=(int)n;
        if(n ==x){
            System.out.println("integer");
        }
        else System.out.println("not integer");
    }
}

package Day_10;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive number :");
        int n=sc.nextInt();
        if(n<69 && n>-69){
            System.out.println("magnitude less than 69");
        }
        else System.out.println("not");
    }
}

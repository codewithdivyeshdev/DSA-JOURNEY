package Day_10;

import java.util.Scanner;

public class profitORloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price :");
        int n=sc.nextInt();
        System.out.print("enter selling price :");
        int sp=sc.nextInt();
        int total=sp-n;
        if(total >= 0){
            System.out.println("profit :"+total);
        }
        else System.out.println("loss :"+(-total));
    }
}

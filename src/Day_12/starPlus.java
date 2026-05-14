package Day_12;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows :");
        int n=sc.nextInt();
      int temp=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
              if(i==temp||j==temp) System.out.print("* ");
              else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

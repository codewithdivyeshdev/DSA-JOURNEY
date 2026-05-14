package Day_12;

import java.util.Scanner;

public class numberTriangle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows :");
        int row=sc.nextInt();
        System.out.print("enter columns :");
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

package Day_12;

import java.util.Scanner;

public class starTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j>n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=n-i+1;k<=n;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}

package Day_12;

import java.util.Scanner;

public class alphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        int temp=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print((char)(temp+64)+" ");

            }
            temp++;
            System.out.println();
        }
    }
}

package Day_12;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows :");
        int n=sc.nextInt();
       int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}

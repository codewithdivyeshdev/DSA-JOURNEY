package Day_12;

import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
          int nst=n-1,nsp=1;
        for (int i = 1; i <=2*n-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i=1;i<=n-1;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }

            for (int k = 1; k <=nsp ; k++) {
                System.out.print("  ");
            }


            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nst--;
            nsp+=2;
            System.out.println();
        }
    }
}

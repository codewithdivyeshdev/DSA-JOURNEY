package Day_12;

import java.util.Scanner;

public class flippedAlphabetTriangle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}

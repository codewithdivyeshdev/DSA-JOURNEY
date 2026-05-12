package Day_10;

import java.util.Scanner;

public class sideOFtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  three side of triangle :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("trianlge");
        }
        else System.out.println("not");

    }
}

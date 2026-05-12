package Day_10;

import java.util.Scanner;

public class rectangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of rectagular :");
        int a=sc.nextInt();
        System.out.println("enter breadth");
        int b=sc.nextInt();
        int area=a*b;
        int perimeter=2*(a+b);
        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }
        else System.out.println("perimeter is greater than area");
    }
}

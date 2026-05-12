package Day_10;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        int r=sc.nextInt();
        double pi=3.14;
        double area=r*pi*r;
        System.out.println(area);
    }
}

package Day_11;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();

//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
//        for(int i=0;i<n;i++){
//            System.out.println("raghav");
//        }
//        for(int i=0;i<n;i++){
//            if(i%2==0) System.out.println(i);
//
//        }
//        for(int i=1;i<=10;i++){
//            System.out.println(i*7);
//        }
//        for(int i=1;i<=n;i++){
//            if(i%2!=0 && i%3==0) System.out.println(i);
//        }
//        for(int i=n;i>0;i--){
//            System.out.println(i);
//        }
//        for(int i=1;i<=10;i=i+2){
//            System.out.println(i+2);
//        }
//        for(int i=n;i>0;i=i-2){
//            System.out.println(i);
//        }
//        int a =1,r=2;
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a*=r;
//        }
//        for(int i=0;i<=n;i++){
//            System.out.println(i);
//            System.out.println(n-i);
//        }
//        for(int i=65;i<=90;i++){
//            System.out.println((char)i+" "+i);
//        }
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0) {
//                System.out.println("composite");
//                break;
//            }
//            else System.out.println("not");
//
//        }
//        int i=0;
//        while(i<5){
//            System.out.print(i+" ");
//            i++;
//        }
//        int i=1;
//        do{
//            System.out.print(i+" ");
//            i++;
//        }while(i<5);
        int count=0;
        if(n==0) n=8;
       while(n!=0){
           n=n/10;
           count++;
       }
        System.out.println(count);

    }
}

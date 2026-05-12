package Day_8;//find max count of positive integer and negative integer

public class leetcode_2529 {
    public static void main(String[] args) {
        int []a={-3,-2,-1,0,1,2,3,4};
        int Pcount=0,Ncount=0,count=0;
        //here i use for loop but that can take more time to run
        //there for time complexity ==O(N)
        for(int i=0;i<a.length;i++){
            if(a[i]>0) Pcount++;
            if(a[i]<0) Ncount++;
        }
        System.out.println( Math.max(Pcount,Ncount));
        //using binary search

    }
}

package Day_9;

public class singlelementInDoublesInSortedArray {
    public static void main(String[] args) {
        int []a={1,1,2,2,3,3,4,5,5,6,6,7,7};
        int i=0,j=a.length,n=j-1;
        if(j == 1) System.out.println(a[i]);
        if(a[0] != a[1]) System.out.println(a[i]);
        if(a[j] != a[j-1]) System.out.println(a[j]);
       while(i<=n){
           int mid=i+(n-i)/2;
           if(a[mid] !=a[mid+1] && a[mid] !=a[mid-1]){
               System.out.println(a[mid]);
           }
           int f=mid,s=mid;
           if(a[mid] ==a[mid+1]) s=mid+1;
           if(a[mid] == a[mid-1]) f=mid-1;
           int leftcount=f-i;
           int rightcount=n-s;
           if(leftcount%2 == 0) i=s+1;
           else n=f-1;
       }



    }
}

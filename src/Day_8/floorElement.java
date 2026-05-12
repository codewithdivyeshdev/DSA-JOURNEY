package Day_8;

public class floorElement {
    public static void main(String[] args) {
        int []a={1,2,4,53,64,75};
        int i=0,j=a.length-1,index=-1,target=5;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]>target) j=mid-1;
            else{
                index=mid;
                i=mid+1;
            }
        }
        System.out.println(index);
    }
}

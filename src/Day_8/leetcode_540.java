package Day_8;//single element in soubles sorted array

public class leetcode_540 {
    public static void main(String[] args) {
        int []nums={1,1,2,3,3,4,4,8,8};
        int i=0,j=nums.length-1,count=0;
        while(i<=j){
            int mid=i+((j-i)/2);
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                count=nums[mid];
            }
            else if(nums[mid]==nums[mid+1]) mid=mid+1;
            else if(mid%2==0) i=mid+1;
            else j=mid-1;
        }
        System.out.println(count);
    }
}

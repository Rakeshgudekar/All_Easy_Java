package patternpractice;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={12,11,10,9,8,7,6,5,4,3,2,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);


    }
    static int search(int[] arr,int target ){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}

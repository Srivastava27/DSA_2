package Array;

public class MaxSumSubarray {
    public static void main(String[] args){
        int arr[]={3,5,7,10,2,12,14,-1,-5};

        int ans=largestSumSubarray(arr);
        System.out.println(ans);

    }

    public static int largestSumSubarray(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(maxSum>curSum) maxSum=curSum;
            if(curSum<0) curSum=0;
        }
        return maxSum;
    }
}

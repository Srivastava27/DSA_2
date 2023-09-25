package Array;

public class MaxOf {
    public static void main(String[] args){
        int arr[]={1,4,6,8,10};
        int index=max(arr);
        System.out.println("Index of largest element is : "+index);
        System.out.println("Largest element is : "+arr[index]);
    }


    public static int max(int arr[]){
        if(arr.length==0) return -1;
        int maxIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}

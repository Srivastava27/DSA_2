package Array;

public class RemoveDuplicates {
    public static void main(String[] args){
         int arr[]={1,3,3,3,5,5,5,7,7,7,8,9,2,2};
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] != arr[j]){
            arr[j+1]=arr[i];
            j++;
        }
    }

    for (int i : arr) {
        System.out.println(i);
    }

    }
   

}

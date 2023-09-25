package Array;

public class Delete {
    public static void main(String[] args){
        int arr[]={1,2,4,5,6};
        int key=4;

        delete(arr, key);
        for(int e:arr){
            System.out.println(e+" ");
        }
    }

    public static int delete(int arr[],int key){
        int i=0;
        int n=arr.length;
        for(;i<n;i++){
            if(arr[i]==key){
                break;
            }
        }
        if(i==n) return n;
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];   //for left shifting

        }
        return n-1;
    }
}

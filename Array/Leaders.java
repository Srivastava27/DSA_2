// leaders are the numbers which do not have larger element on their right

package Array;

public class Leaders {
    public static void main(String[] args){
        int arr[]={2,5,7,8,4,18};
        LeadersInArray(arr);
    }

    public static void LeadersInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>largest){
                largest=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}

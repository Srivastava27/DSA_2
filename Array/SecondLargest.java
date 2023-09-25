package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int arr[]={2,1,4,6,10};

    //     int index=secondLar(arr);
    //     System.out.println("Index of second largest element is: "+arr[index]);
    //     System.out.println("Second largest element is: "+index);
    // }


        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){ //sort krke easy ho jata h lekin time complexity badh jayi h
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(arr[arr.length-2]);




    // public static int secondLar(int arr[]){
    //     if(arr.length<2) return -1;

    //     int largest=0;
    //     int secLar=-1;

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>arr[largest]){
    //             largest=i;
    //         }else if(arr[i]<arr[largest]){
    //             if(secLar==-1 || arr[i]>arr[secLar]){
    //                 secLar=i;
    //             }
    //         }
    //     }
    //     return secLar;
    }

}


class secLar_sort{
    public static void main(String[] args){
        int arr[]={31,2,86,54,3,2,0,23};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}

// array is a type of data structure which stores data in a contigous fashion
// it also stores similar type of data


package Array;

class Find{

    public static void main(String[] args){
        int arr[]={1,4,5,6,7,8};
        int key=4;

        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                res=i;
                break;
            }
        }

        if(res==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("key found at index : "+res);
        }
    }
}


    
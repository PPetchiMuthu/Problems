//program to left rotate the element of the array

public class GS43 {
    public static void main(String args[]){
        int arr[] ={2,4,5,6,7,8,9};
        for(int i=0;i< arr.length/2;i++){
            int tem = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=tem;
        }
        System.out.print("Array : ");
        for(int tem:arr)
            System.out.print(tem+" ");
    }
}


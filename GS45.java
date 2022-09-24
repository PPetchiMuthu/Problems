//print the sum of all the item in the array

public class GS45 {
    public static void main(String args[]){
        int arr[]={1,2,43,5,67,5,6,3,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        System.out.println("Sum = "+sum);
    }
}

//print the duplicate element of an array

public class GS44 {
    public static void main(String args[]){
        int arr[]= {1,2,2,3,4,5,3,5,3,6,8};
        a:for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j< arr.length;j++)
                if(arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                    continue a;
                }
    }
}

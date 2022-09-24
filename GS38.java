//find the largest element in a array

public class GS38 {
    static int largest(int[] var){
        int lar = Integer.MIN_VALUE;
        for(int k:var)
           if(lar<k)
               lar=k;
        return lar;
    }
    public static void main(String args[]){
        int arr[]= {2,4,5,3,6,8,1};
        System.out.println(largest(arr));
    }
}

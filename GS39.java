//find the smallest element in a array

public class GS39 {
    static int smallest(int[] var){
        int lar = Integer.MAX_VALUE;
        for(int k:var)
            if(lar>k)
                lar=k;
        return lar;
    }
    public static void main(String args[]){
        int arr[]= {2,4,5,3,6,8,1};
        System.out.println(smallest(arr));
    }
}


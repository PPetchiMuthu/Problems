 //rearrange the array the first element is first minimum and second first maximum

public class GS10 {
    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6};
        int len = arr.length;
        int arr2[]= new int[len];
        System.out.print("Given Array : ");
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
        for(int i=0;i<len-1;i++)
            for(int j=i;j<len;j++)
                if(arr[i]>arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
        int small=0, large= len-1, i=0;

        while (small<(len/2)) {
            arr2[i++] = arr[large--];
            arr2[i++] = arr[small++];

        }
        if(len%2!=0)
            arr2[i] = arr[large];
        System.out.print("Output : ");
        for(i=0;i<len;i++)
            System.out.print(arr2[i]+"  ");



    }
}


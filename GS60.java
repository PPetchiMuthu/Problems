//input=5; output = 1+11+111+1111+11111=12345

import java.util.Scanner;

public class GS60 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int sum = 0;
        int one = 1;
        for(int i=1;i<=num;i++){
            System.out.print(one);
            if(i<num)
                System.out.print(" + ");
            sum = sum+one;
            one = (one*10)+1;
        }
        System.out.println(" = "+sum);
    }
}


/*print the pattern

 */

import java.util.Scanner;

public class GS50 {
    public static void main(String args[]){
        int space =60;
        for(int i=9;i>=1;i--){
            for(int sp=0;sp<space;sp++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
            space+=1;
        }
    }
}



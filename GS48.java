/*print the pattern input=4
                     9
                   8 9 8
                 7 8 9 8 7
               6 7 8 9 8 7 6
 */

import java.util.Scanner;

public class GS48 {
    public static void main(String args[]){
        int space =60;
        for(int i=9;i>=1;i--){
            for(int sp=0;sp<space;sp++)
                System.out.print(" ");
            for(int j=i;j<=9;j++)
                System.out.print(j+"   ");
            for(int k=9-1;k>=i;k--)
                System.out.print(k+"   ");
            System.out.println();
            space-=4;
        }
    }
}


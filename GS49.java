/*print the pattern input=4
              * * * * * * *
               * * * * * *
                * * * * *
                 * * * *
                  * * *
                   * *
                    *
 */

import java.util.Scanner;

public class GS49 {
    public static void main(String args[]){
        int space =60;
        for(int i=1;i<=9;i++){
            for(int sp=0;sp<space;sp++)
                System.out.print(" ");
            for(int j=i;j<=9;j++)
                System.out.print("* ");
            System.out.println();
            space+=1;
        }
    }
}


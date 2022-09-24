/*print the pattern input=4
                     1
                   1 2 1
                 1 2 3 2 1
               1 2 3 4 3 2 1
 */

import java.util.Scanner;

public class GS47 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int space =60;
        for(int i=1;i<=num;i++){
            for(int sp=0;sp<space;sp++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print(j+"   ");
            for(int k=i-1;k>=1;k--)
                System.out.print(k+"   ");
            System.out.println();
            space-=4;
        }
    }
}

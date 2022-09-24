//draw the given pattern

import java.util.Scanner;

public class GS58 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++)
                System.out.print("*");
             for(int j=0;j<2*i;j++)
                System.out.print("_");
            for(int j=0;j<num-i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=num-2;i>=0;i--) {
            for (int j = 0; j < num - i; j++)
                System.out.print("*");
            for (int j = 0; j < 2 * i; j++)
                System.out.print("_");
            for (int j = 0; j < num - i; j++)
                System.out.print("*");
            System.out.println();

        }
    }
}

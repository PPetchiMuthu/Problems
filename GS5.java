/* print the pattern
  intput:E
  output:EEEEE
         DDDD
         CCC
         BB
         A
 */

import java.util.Scanner;

public class GS5 {
    static void pattern(char ch){
        for(int j=(int)ch-64;j>0;j--) {
            for (int i = j; i > 0; i--)
                System.out.print((char) (64 + j));
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(ch>90)
            ch =(char)((int)ch-32);
        pattern(ch);
    }
}



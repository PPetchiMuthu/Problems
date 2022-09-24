/* draw the x pattern for odd number
   input 12345
   output 1   1
           2 2
            3
           4 4
          5   5
 */
import java.util.Scanner;

public class GS7 {
    static void xpattern(String str){
        int space = 30;
        a:for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int k = 0; k < str.length(); k++) {
                if(i==k||k==str.length()-1-i)
                    System.out.print(str.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        xpattern(num);


    }

}


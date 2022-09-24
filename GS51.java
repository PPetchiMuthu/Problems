//print the given number in reverse order without using the string

import java.util.Scanner;

public class GS51 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev =0;
        while(num!=0){
            int last_digit = num % 10;
            rev = rev*10 + last_digit;
            num /= 10;
        }
        System.out.println("The number in reverse order : "+rev);
    }
}

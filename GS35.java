//find the Factorial of the number and sum of the factorial number digits

import java.util.Scanner;

public class GS35 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++)
            factorial *= i;
        System.out.println(num + "  factorial : " + factorial);
        int sum=0;
        while(factorial!=0){
            int lastd = factorial%10;
            sum +=  lastd;
            factorial /= 10;
        }
        System.out.println("Sum : "+sum);
    }
}

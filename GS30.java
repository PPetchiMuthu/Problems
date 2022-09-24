//Find the largest  number among three numbers

import java.util.Scanner;

public class GS30 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thre number : ");
            int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        num1 = (num1>num2)?num1:num2;
        num1 = (num1>num3)?num1:num3;
        System.out.println("Largest No : "+num1);
    }
}


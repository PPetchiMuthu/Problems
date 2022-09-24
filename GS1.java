//write a single program to generate a multiplication and subtraction table

import java.util.Scanner;

public class GS1 {
    static void multi(int num)
    {
        System.out.println("Multiplication Table");
        for(int i=1;i<=10;i++)
            System.out.println(i+" * "+num+" = "+(i*num));
    }
    static void sub(int num)
    {
        System.out.println("Subtraction Table");
        for(int i=1;i<=num;i++)
            System.out.println(i+" - "+num+" = "+(num-i));
    }
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    multi(num);
    sub(num);
}
}

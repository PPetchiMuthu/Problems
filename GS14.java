//find the area of the rectangle

import java.util.Scanner;

public class GS14 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the breath : ");
        int breath = scan.nextInt();
        System.out.print("Enter the height : ");
        int heigth = scan.nextInt();
        System.out.println("Area of the rectangle : "+(breath*heigth/2.0));
    }
}

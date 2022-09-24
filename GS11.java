//left rotate the elements of a multidimensional array

import java.util.Scanner;
public class GS11 {

    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter no of columnn: ");
        int column = scanner.nextInt();
        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        System.out.println("Enter the values : ");
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                a[i][j] = scanner.nextInt();
        System.out.println(" Given Array");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
        for(int i=0;i<row;i++)
            for (int j = 0; j < column; j++){
                b[i][j]=a[j][i];
            }
        for(int j=0;j<(row/2);j++)
            for(int i=0;i<column;i++) {
                int tem = b[j][i];
                b[j][i] = b[(row-j)-1][i];
                b[(row - j)-1][i] = tem;
            }
        System.out.println(" Output");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++)
                System.out.print(b[i][j]+"  ");
            System.out.println();
        }

    }

}



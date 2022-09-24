import java.util.Scanner;

public class GS2 {
    static void print(char ch){
        for(int i=(int)ch;i<=90;i++)
        {
            System.out.print((char)i);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if (ch>97)
            ch =(char)((int)ch - 32);
        print(ch);
    }
}

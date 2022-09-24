

public class ZS441 {
    public static void main(String args[]){
        String str = "12345";
        int len = str.length();
        int dum = len;
        if(len%2!=0)
            dum +=1;

        int space = 30;
        for (int j = 0; j <= space; j++)
            System.out.print(" ");
        System.out.println(str.charAt(0));

        for(int i=0;i<dum/2;i++) {
            int k;
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for ( k = 0; k <= i; k++)
                    System.out.print(str.charAt(k) + " ");

            for (int l = Math.max(len-i-1,k); l <= len-1 ; l++)
                System.out.print(str.charAt(l) + " ");
            System.out.println();
            space = space - 2;
        }

         space = space +3;

        for(int i=dum/2-1;i>0;i--) {
            for (int j = 0; j <= space; j++)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print(str.charAt(k) + " ");
            for (int l = len - i; l <= len -1 ; l++)
                System.out.print(str.charAt(l) + " ");
            System.out.println();
            space = space + 2;
        }

        space =30;

        for (int j = 0; j <= space; j++)
            System.out.print(" ");
        System.out.println(str.charAt(0));

    }
}


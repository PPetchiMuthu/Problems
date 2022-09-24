//input a1b2c3 output : abbccc


public class GS53 {
    public static void main(String args[]){
        String str = "a1b2c3c4";
        String num = "";
        char word =' ';

        for(char ch:str.toCharArray()){

            if(!(ch>='0'&&ch<='9')){
                if(num!="") {
                    int n = Integer.valueOf(num);
                    for(int i=0;i<n;i++)
                      System.out.print(word);
                    num="";
                }
                word = ch;
            }
            else
                num+=ch;

        }
        for(int i=0;i<Integer.parseInt(num);i++)
            System.out.print(word);

    }
}

package RECURTION;

public class reverse {
    
    public static String printReverse(String str){
        if(str.length()==1){
            return str;
        }
        char currChar = str.charAt(0);
        String nextString = printReverse(str.substring(1));
        return nextString + currChar;

    }
    public static void main(String args[]){
        System.out.println(printReverse("abcde"));
    }
}

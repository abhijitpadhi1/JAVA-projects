package BIT_MANIPULATION;

public class update_bit {
    public static void main(String[]args){
        int n = 5;              //0101
        int pos = 3;
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            int newNum = bitMask | n;
            System.out.print(newNum);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.print(newNum);
        }
    }
}

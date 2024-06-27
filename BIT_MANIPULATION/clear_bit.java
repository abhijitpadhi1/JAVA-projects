package BIT_MANIPULATION;

public class clear_bit {
    public static void main(String[]args){
        int n = 5;                //0101
        int pos = 0;
        int bitMask = ~(1<<pos);
        int newNum = n & bitMask;
        System.out.print(newNum);

    }
}

package BIT_MANIPULATION;

public class set_bit {
    public static void main(String[]args){
        int n=5;           //0101
        int pos=1;
        int bitMask=1<<pos;
        int newnum=bitMask|n;
        System.out.print(newnum);
    }
}

package BIT_MANIPULATION;

public class get_bit {
    public static void main(String[]args){
        int n=5;      //0101
        int pos=3;
        //Creat Bitmask
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.print("Bit is 0");
        }
        else{
            System.out.print("Bit is 1");
        }
    }
}

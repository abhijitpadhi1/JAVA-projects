package RECURTION;

public class firstoccurrence_lastoccurrence {
    
    public static int firstOccurrence = -1;
    public static int lastOccurrence = -1;
    
    public static void findOccurrence(String str,char el,int idx){
        if(str.length()-idx==1){
            System.out.println("First occurrence is at "+firstOccurrence);
            System.out.println("Last occurrence is at "+lastOccurrence);
            return;
        }
        if(str.charAt(idx)==el){
            if(firstOccurrence==-1){
                firstOccurrence=idx;
            }
            else{
                lastOccurrence=idx;
            }
        }
        findOccurrence(str, el, idx+1);
    }
    public static void main(String args[]){
        findOccurrence("rteeyuyueejjeeeyy", 'e', 0);
    }
}

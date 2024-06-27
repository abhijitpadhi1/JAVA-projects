package RECURTION;

public class remove_duplicate {
    public static boolean map[] = new boolean[26];
    public static String remove(String str, int idx, String result){
        if(str.length()==idx){
            return "";
        }
        char curChar = str.charAt(idx);
        if(map[curChar-'a']){
            result = remove(str, idx+1, result);
            return result;
        }
        else{
            map[curChar-'a'] = true;
            result = curChar + remove(str, idx+1, result);
            return result;
        }
    }
    public static void main(String args[]){
        String str = "aabbccdde";
        System.out.println(remove(str, 0, ""));

    }
}

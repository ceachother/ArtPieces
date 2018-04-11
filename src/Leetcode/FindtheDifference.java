package Leetcode;

/**
 * Created by cecillee on 6/11/2016.
 */
public class FindtheDifference {
    public static void main(String[] args) {
        char[] tCharArray = "".toCharArray();
        char a = 0^'a';
        System.out.println(a);
    }

    public char findTheDifference(String s, String t) {
        //TODO whether s or t is null
//        if(s ==null || t == null)
//            return ;

        String[] sArray = s.split("");
        String result = "";
        for(int i = 0;i<sArray.length;i++)
        {
            result=t.replace(sArray[i],"");
        }
        char[] tCharArray = result.toCharArray();
        String a = tCharArray + "";
        return tCharArray.length > 0?' ':tCharArray[0];


    }
}

package datastructure.strings;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println(stringRotation("abcd","cdab"));
    }

    public static boolean stringRotation(String str1, String str2)
    {
        if(str1 == str2)
        {
            return true;
        }
        if(str1 == null || str2 == null)
        {
            return false;
        }

        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 != len2)
        {
            return false;
        }

        int i = 0;
        int end = 0;
        boolean same = false;
        for( int j = 0; j < len1; j++)
        {
            if(str1.charAt(i) == str2.charAt(j))
            {
                i++;
                same = true;
            } else if(same)
            {
                return false;
            } else {
                end = j;
            }
        }

        String sub = str2.substring(0,end+1);
        return str1.contains(sub);
    }
}

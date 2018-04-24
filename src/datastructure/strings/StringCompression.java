package datastructure.strings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression("cccaaabbbBb"));
    }

    public static String stringCompression(String str)
    {
        StringBuilder sb = new StringBuilder();
        int times = 0;
        for(int i = 0; i < str.length(); i++)
        {
            times++;

            if( (i+1) == str.length() || str.charAt(i) != str.charAt(i+1))
            {
                sb.append(str.charAt(i));
                sb.append(times);
                times = 0;
            }
        }
        String newString = sb.toString();
        return newString.length() < str.length() ? newString : str;
    }
}

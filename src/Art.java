import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;


/**
 * Created by cecillee on 2/1/16.
 */
public class Art {
    public static void main(String[] args) throws Exception {
//        Map<String,String> env = System.getenv();
//        for (String name : env.keySet())
//        {
//            System.out.println(name + "----->" + env.get(name));
//
//        }
//
//        System.out.println(System.getProperty("os.name"));

//        System.out.println(BigDecimal.valueOf(0.1));
//        String str = "hello , Cecil";
//        System.out.println(str.replaceFirst("\\w*?","@"));

//        int[] nums = {-1};
//        singleNumber(nums);

//        isPowerOfThree(45);

        findAnagrams("cbaebabacd","abc");
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        if(nums == null || nums.length == 0)
        {
            return result;
        }
        result = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            result -= nums[i];
        }
        if(result < 0)
        {
            result = 0 - result;
        }
        return result;
    }

    public static boolean isPowerOfThree(int n) {
        if(n < 1)
            return false;
        if(n == 1)
            return true;

        String intString = n + "";
        String[] intChar = intString.split("");
        int Sum = 0;
        for(int i = 0;i<intChar.length;i++)
        {
            if(intChar[i].equals(""))
                continue;
            int integer = Integer.parseInt(intChar[i]);
            Sum = Sum + integer;
        }

        float f = (float)Sum;
        int sumDiThree = Sum/3;

        if((float)f/sumDiThree == 3)
            return true;
        else
            return false;
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> resultInts = new ArrayList();
        if(s == null || p == null || s.length() < p.length() )
        {
            return resultInts;
        }

        int[] intArr = new int[26];
        for(char pChar : p.toCharArray())
        {
            intArr[pChar-'a']++;
        }
        int begin = 0, end = 0, count = p.length();

        while(end < s.length())
        {
            if(intArr[s.charAt(end++)-'a']-- >= 1)
            {
                count--;
            }

            if(count == 0)
            {
                resultInts.add(begin);
            }

//            begin++ is because need to move begin to the next
//            intArr[s(begin-'a')]++ is because need to reset the intArr
//            when intArr[s(begin-'a')] >= 0 then count++ is because this intArr[i] is in the p,
//            and the new window should not include this intArr[i] for now, but should include this digit in i+1

            if(end-begin == p.length() && intArr[s.charAt(begin++)-'a']++ >=0)
            {
                count++;
            }
        }
        return resultInts;
    }
}


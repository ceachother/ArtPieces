package Leetcode;

/**
 * Created by cecillee on 6/11/2016.
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(30000000));
    }

    public static boolean isUgly(int num) {
        if(num<1)
        {
            return false;
        }

        if(num==1)
        {
            return true;
        }

        return isUglyNum(num);
    }

    private static boolean isUglyNum(int num)
    {
        if(num%2 >0)
        {
            if(num%3>0)
            {
                if(num%5>0)
                {
                    return false;
                }
                else
                {
                    num = num/5;
                }
            }
            else
            {
                num = num/3;
            }

        }
        else
        {
            num = num/2;
        }
        if(num>2)
        {
            return isUglyNum(num);
        }
        return true;
    }
}

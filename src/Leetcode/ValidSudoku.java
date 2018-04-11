package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cecillee on 5/11/2016.
 */
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'.','8','7','6','5','4'},
                {'3','2','1','.','.','.','.','.','.','.','.'}};
        char[] row = new char[9];
        System.out.println(null == null);
        System.out.println(row[3]);
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        if (board == null)
        {
            return true;
        }

        for(int i = 0;i<9;i++)
        {
            boolean invalidRow = hasSame(board[i]);
            if(invalidRow)
            {
                return false;
            }

            char[] num = new char[9];
            for(int j = 0;j<0;j++)
            {
                num[j] = board[j][i];
            }
            boolean invalidColume = hasSame(num);
            if(invalidColume)
            {
                return false;
            }
        }

        char[] num = new char[9];
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            }

        }
        return true;
    }

    private static boolean hasSame(char[] nums)
    {
        for(int i = 0;i<nums.length-1;i++)
        {
            char num1 = nums[i];
            if(num1 != '.')
            {
                for(int j = i+1; j<nums.length;j++)
                {
                    if(num1 == nums[j] )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

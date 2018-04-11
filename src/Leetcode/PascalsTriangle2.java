package Leetcode;

import java.util.*;

/**
 * Created by cecillee on 13/11/2016.
 */
public class PascalsTriangle2 {

    public static void main(String[] args) {
//        System.out.println(getRow(5));
        List<Integer> list = new ArrayList();
        list.add(1);
        
        list.set(0, 9);
        System.out.println(list);

    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> resList = new ArrayList();
        List<Integer> last = new ArrayList();

        for(int i=0;i<=rowIndex;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==0||i==1)
                {
                    resList.add(1);
                }
                else{
                    if(j==0||j==i)
                    {
                        resList.add(1);
                    }
                    else{
                        resList.add(last.get(j-1)+last.get(j));
                    }
                }
            }
            last=resList;
        }
        return resList;
    }
}

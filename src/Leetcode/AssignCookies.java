package Leetcode;

import java.util.Arrays;

/**
 * Created by cecillee on 15/5/2017.
 */
public class AssignCookies {

    public static void main(String[] args) {
//        int[] g = {1};
//        int[] s = {5, 6, 7, 8};
//        findContentChildren(g, s);
        int i = 0/2;
        System.out.println(i);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for(int i=0;res<g.length &&i<s.length;i++)
        {
            if(s[i]>=g[res])
            {
                res++;
            }
        }
        return res;
    }
}

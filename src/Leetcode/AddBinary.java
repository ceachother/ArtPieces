package Leetcode;

/**
 * Created by cecillee on 15/5/2017.
 */
public class AddBinary {
    public static void main(String[] args) {
        String result = addBinary("1", "1");
        System.out.println(result);
//        System.out.println(7/3);
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            sb.append(sum%2);
            carry = sum / 2;
        }
        if (carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}

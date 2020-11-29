package leetcode._67_Add_Binary;

/**
 * [67. Add Binary](https://leetcode.com/problems/add-binary/)
 */
public class Solution {
    public String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int aInt = 0;
            int bInt = 0;
            int aLength = a.length() - i - 1;
            int bLength = b.length() - i - 1;
            if (aLength >= 0) {
                aInt = Integer.parseInt(String.valueOf(a.charAt(aLength)));
            }
            if (bLength >= 0) {
                bInt = Integer.parseInt(String.valueOf(b.charAt(bLength)));
            }
            int result = aInt + bInt + c;
            if (result == 2) {
                sb.append("0");
                c = 1;
            } else if (result == 3) {
                sb.append("1");
                c = 1;
            } else {
                sb.append(result);
                c = 0;
            }
        }
        if (c == 1) {
            sb.append("1");
        }

        return sb.reverse().toString();
    }
}
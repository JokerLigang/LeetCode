/**
 * Created by joker on 2016/12/15.
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if (s == null) return 0;

        char[] chars = s.toCharArray();

        if (chars.length == 0) return 0;

        int max = 1;

        int barrier = 0;


        for (int i = 1; i < chars.length; i++) {
            for (int j = i - 1; j >= barrier; j--) {
                if (chars[i] == chars[j]) {
                    barrier = j + 1;
                    break;
                }

            }


            max = Math.max(max, i - barrier + 1);
        }


        return max;


    }


    public static void main(String[] args) {

        int abcabcbb = new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);
    }
}

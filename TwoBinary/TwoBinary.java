/**
 * Created by joker on 2016/12/13.
 */
public class TwoBinary {


    public static int toInt(char c) {

        if (c >= '0') return c - '0';

        return 0;

    }

    public static int toInt(char[] chars, int index) {

        if (index < chars.length && index >= 0) return toInt(chars[index]);

        return 0;
    }


    public String addBinary(String a, String b) {

        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();

        int length = Math.max(ca.length, cb.length);

        int[] temp = new int[length + 1];

        for (int i = 0; i < length; i++) {

            temp[i] += toInt(ca, ca.length - 1 - i) + toInt(cb, cb.length - 1 - i);
            temp[i + 1] += temp[i] / 2;
            temp[i] %= 2;


        }

        String ss = "";

        for (int i = length - 1; i >= 0; i--) {
            ss = ss + temp[i];
        }

        if (temp[length] == 1) ss = "1" + ss;

        return ss;


    }

    public static void main(String[] args) {
        System.out.println(new TwoBinary().addBinary("11", "1"));
    }
}

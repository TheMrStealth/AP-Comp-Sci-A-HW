package HW17_Slide397;

import java.util.ArrayList;

/**
 *
 * @author robert.gillette
 */

public class HW17Q11 {
    public static void insertionSort4(String[] s) {
        for (int i = 0; i < s.length; i++) {
            int j = i;
            while (j > 0 && s[j].compareTo(s[j-1]) > 0) {
                String temp = s[j];
                s[j] = s[j-1];
                s[j-1] = temp;
                j--;
            }
        }
    }
    public static double findAvgLen(String[] s) {
        double sum = 0;
        for (String a : s) {
            sum += a.length();
        }
        return sum / s.length;
    }
    public static ArrayList<String> toList(String[] s) {
        ArrayList<String> S = new ArrayList<>();
        for (String a : s) {
            if (!containsString(S,a)) {
                S.add(a);
            }
        }
        return S;
    }
    public static boolean containsString(ArrayList<String> S, String s) {
        boolean contains = false;
        for (String a : S) {
            if (a.equals(s)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}

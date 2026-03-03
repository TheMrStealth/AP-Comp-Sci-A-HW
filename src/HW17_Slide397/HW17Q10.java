package HW17_Slide397;

import Helpers.CompSciHW;

/**
 *
 * @author robert.gillette
 */

public class HW17Q10 {
    public static void insertionSort3(String[] s) {
        for (int i = 0; i < s.length; i++) {
            int j = i;
            while (j > 0 && s[j].compareTo(s[j-1]) < 0) {
                String temp = s[j];
                s[j] = s[j-1];
                s[j-1] = temp;
                j--;
            }
        }
    }
    public static String findLongest(String[] s) {
        int max = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > s[max].length()) {
                max = i;
            }
        }
        return s[max];
    }
    public static void printOs(String[] s) {
        for (String a : s) {
            if (a.contains("o")) {
                    System.out.print(a+" ");
            }
        }
        System.out.println();
    }
}

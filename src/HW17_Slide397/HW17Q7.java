package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */

public class HW17Q7 {
    public static void main(String[] args) {
        String[] s = {"apple","mom","pines","string","zebra","bob"};
        sortStrings(s);
        for (String t : s) {
            System.out.print(t+" ");
        }
    }
    public static void sortStrings(String[] s) {
        for (int i = 0; i < s.length-1; i++) {
            int mindex = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[mindex].length() > s[j].length()) {
                    mindex = j;
                } else if (s[mindex].length() == s[j].length()) {
                    if (s[mindex].compareTo(s[j]) < 0) {
                        mindex = j;
                    }
                }
            }
            String temp = s[mindex];
            s[mindex] = s[i];
            s[i] = temp;
        }
    }
}

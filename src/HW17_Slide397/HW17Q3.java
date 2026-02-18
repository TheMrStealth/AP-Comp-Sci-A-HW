package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */
public class HW17Q3 {
    public int binarySearch1(String[] s, String target) {
        int index = -1;
        int left = 0, right = s.length-1, middle;
        while (left <= right) {
            middle = (left+right)/2;
            if (target == s[middle]) {
                return middle;
            } else if (target.compareTo(s[middle]) > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}

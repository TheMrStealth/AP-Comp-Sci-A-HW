package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */
import java.util.ArrayList;
public class HW17Q4 {
    public int binarySearch2(ArrayList<Integer> a, int target) {
        int index, left = 0, right = a.size()-1, middle;
        while (left >= right) {
            middle = (left+right)/2;
            if (target == a.get(middle)) {
                return middle;
            } else if (target < a.get(middle)) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return -1;
    }
}

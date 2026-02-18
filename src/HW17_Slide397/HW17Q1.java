package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */
import java.util.ArrayList;
public class HW17Q1 {
    public void sequentialSearch1(ArrayList<Integer> a, int n) {
        int i = -1;
        for (int k = 0; k < a.size(); k++) {
            if (a.get(k)==n) {
                i = k;
            }
        }
        System.out.println("Index of "+n+"is "+i);
    }
}

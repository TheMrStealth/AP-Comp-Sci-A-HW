package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */
import java.util.ArrayList;
public class HW17Q2 {
    public String sequentialSearch2(int[][] a, int target) {
        int m=-1,n=-1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]==target) {
                    m = i;
                    n = j;
                }
            }
        }
        if (m==-1 && n==-1) {
            return "Target not found";
        } else {
            return "Target found at index("+m+","+n+")";
        }
    }
}

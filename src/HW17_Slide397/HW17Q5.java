package HW17_Slide397;

/**
 *
 * @author robert.gillette
 */
import java.util.ArrayList;
import java.util.Scanner;
public class HW17Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            a.add((int)(Math.random()*100)+1);
        }
        System.out.println("Percentage of numbers over 50: "+findPercentGreater(a,50));
        selectSort(a);
        System.out.println("Enter a target number");
        int target = in.nextInt();
        System.out.println(binarySearch(a,target));

    }
    public static double findPercentGreater(ArrayList<Integer> a, int min) {
        double i = 0;
        for (int I : a) {
            if (I>min) i++;
        }
        return (i/a.size())*100;
    }
    public static void selectSort(ArrayList<Integer> a) {
        int indexMin;
        for (int i = 0; i < a.size(); i++) {
            indexMin = i;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) < a.get(indexMin)) {
                    indexMin = j;
                }
            }
            int temp = a.get(i);
            a.set(i,a.get(indexMin));
            a.set(indexMin,temp);
        }
    }
    public static int binarySearch(ArrayList<Integer> a, int target) {
        int left = 0, right = a.size(), middle;
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

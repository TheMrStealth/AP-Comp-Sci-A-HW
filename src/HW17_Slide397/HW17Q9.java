package HW17_Slide397;

import java.util.ArrayList;

/**
 *
 * @author robert.gillette
 */

public class HW17Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            a.add((int)(Math.random() * (50 + 1)));
        }
        insertionSort2(a);
        System.out.println(a);
    }
    public static void insertionSort2(ArrayList<Integer> a) {
        for (int i = 1; i < a.size(); i++) {
            int j = i;
            while (j > 0 && a.get(j-1)>a.get(j)) {
                int temp = a.get(j-1);
                a.set(j-1,a.get(j));
                a.set(j,temp);
                j--;
            }
        }
    }
    public static int findMode(ArrayList<Integer> a) {
        int[] b = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == a.get(i) && i!=j) {
                    b[i]++;
                }
            }
        }
        int maxInd = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[maxInd]<b[i]) {
                maxInd = i;
            }
        }
        return a.get(maxInd);
    }
    public static int[] sumConsec(ArrayList<Integer> a) {
        int[] b = new int[a.size()-1];
        for (int i = 0; i < a.size()-1; i++) {
            b[i] = a.get(i) + a.get(i+1);
        }
        return b;
    }
}

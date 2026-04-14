import Helpers.CompSciHW;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    CompSciHW CSHW = new CompSciHW();
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        new Main().randomize(arr);
        arr = new Main().timsort(arr);
//        new Main().CSHW.printIntArr(arr);
        System.out.println(new Main().checkSorted(arr));
    }
    public void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j-1] > a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public int[] timsort(int[] a) {
        int base = a.length/4;
        int rem = a.length%4;

        int[] a1 = new int[base];
        int[] a2 = new int[base + (rem > 2 ? 1 : 0)];
        int[] a3 = new int[base + (rem > 1 ? 1 : 0)];
        int[] a4 = new int[base + (rem > 0 ? 1 : 0)];

        int k = 0;
        System.arraycopy(a, 0, a1, 0, a1.length);
        k += a1.length;
        System.arraycopy(a, k, a2, 0, a2.length);
        k += a2.length;
        System.arraycopy(a, k, a3, 0, a3.length);
        k += a3.length;
        System.arraycopy(a, k, a4, 0, a4.length);
        insertionSort(a1);
        insertionSort(a2);
        insertionSort(a3);
        insertionSort(a4);
        return merge(merge(a1,a2),merge(a3,a4));
    }
    public int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        return c;
    }
    public void randomize(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 1000000);
        }
    }
    public boolean checkSorted(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i+1]) {
                System.out.println(i+":"+a[i]+";"+(i+1)+":"+a[i+1]);
                return false;
            }
        }
        return true;
    }
}
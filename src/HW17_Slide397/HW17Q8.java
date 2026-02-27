package HW17_Slide397;

import Helpers.CompSciHW;

import java.util.Scanner;

/**
 *
 * @author robert.gillette
 */

public class HW17Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,7,2,8,1,78,7,1};
        insertSort(a);
        System.out.println(median(a));
        System.out.println("How many rows do you want in the 2D array?");
        int r = in.nextInt();
        System.out.println("How many columns do you want in the 2D array?");
        int c = in.nextInt();

    }
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j>=0 && a[j-1]>a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
    public static double median(int[] a) {
        if (a.length%2!=0) {
            return a[a.length/2];
        } else {
            return (a[a.length/2] + a[a.length/2 - 1]) / 2.0;
        }
    }
    public static int[][] OneToTwo(int[] a, int r, int c) {
        int[][] b = new int[r][c];
        int k = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (k < a.length) {
                    b[i][j] = a[k];
                    k++;
                } else {
                    b[i][j] = 10;
                }
            }
        }
        return b;
    }
}

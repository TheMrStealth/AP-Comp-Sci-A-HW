package Helpers;

/**
 *
 * @author robert.gillette
 */

public class CompSciHW {
    public void printIntArr(int[] a) {
        for (int b : a) {
            System.out.print(b+" ");
        }
        System.out.println();
    }
    public void printStrArr(String[] a) {
        for (String b : a) {
            System.out.print(b+" ");
        }
        System.out.println();
    }
    public void printIntArr2(int[][] a) {
        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

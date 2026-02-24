package HW17_Slide397;

public class HW17Q6 {
    public void reverseSelect(int[] a) {
        for (int i = a.length-1; i > 0; i--) {
            int min = i;
            for (int j = i-1; j >= 0; j--) {
                if (a[min] < a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for (int b : a) {
            System.out.print(b+" ");
        }
    }
}

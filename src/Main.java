import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,6,1,54,6,2,56,1,3));
        System.out.println(a);
        for (int i = 0; i < a.size()-1; i++) {
            if (a.get(i)>a.get(i+1)) {
                a.remove(i+1);
                i--;
            }
        }
        System.out.println(a);
    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,5,2,7,9,3,4,1,3));
        System.out.println(a);
        for (int i = 0; i < a.size()-1; i++) {
            for (int j = i+1; j < a.size(); j++) {
                if (a.get(j) < a.get(i)) {
                    int temp = a.get(j);
                    a.set(j,a.get(i));
                    a.set(i,temp);
                }
            }
        }
        System.out.println(a);
    }
}
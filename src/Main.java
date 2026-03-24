import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        b.add(1);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);
        c.add(2);
        c.add(2);
        c.add(2);
        c.add(2);
        a.add(b);
        a.add(c);
        System.out.println(a);
    }
}
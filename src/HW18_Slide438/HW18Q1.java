package HW18_Slide438; /**
 *
 * @author robert.gillette
 */

import java.util.*;
import java.io.*;

public class HW18Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\data.txt"));
        String[][] students = new String[10][4];
        for (int i = 0; i < students.length; i++) {
            students[i] = data.nextLine().split(",");
        }
        int mindex = 0;
        for (int i = 0; i < students.length; i++) {
            if (Integer.parseInt(students[i][2]) < Integer.parseInt(students[mindex][2])) {
                mindex = i;
            }
        }
        for (String s : students[mindex]) {
            System.out.print(s+" ");
        }
    }
}

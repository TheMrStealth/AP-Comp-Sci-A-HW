package HW18_Slide438;

/**
 *
 * @author robert.gillette
 */

import java.util.*;
import java.io.*;

public class HW18Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Scanner read = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        PrintWriter write = new PrintWriter(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        String[][] employees = new String[4][4];
        write.println("Jack,0,1500,700\n" + "Jill,1,1500,695\n" + "Bill,2,1800,200\n" + "Hank,3,5000,0");
        write.close();
        readRecords();
    }
    public static void readRecords() throws FileNotFoundException {
        Scanner read = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        while (read.hasNextLine()) {
            String[] emp = read.nextLine().split(",");
            for (String s : emp) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static void addSal() throws FileNotFoundException {
        Scanner read = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        Scanner in = new Scanner(System.in);
    }
}

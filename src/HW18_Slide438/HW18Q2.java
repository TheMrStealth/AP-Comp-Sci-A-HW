package HW18_Slide438;

/**
 *
 * @author robert.gillette
 */

import java.util.*;
import java.io.*;

public class HW18Q2 {

    private ArrayList<ArrayList<String>> records = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        HW18Q2 hw = new HW18Q2();
        Scanner in = new Scanner(System.in);
        Scanner read = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        PrintWriter write = new PrintWriter(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        String[][] employees = new String[4][4];
        write.println("Jack,0,1500,700\n" + "Jill,1,1500,695\n" + "Bill,2,1800,200\n" + "Hank,3,5000,0");
        write.close();
        hw.readRecords();
        System.out.println("Enter the id of an employee");
        hw.addSalary(in.nextInt());
        hw.addSalAll2();

    }
    public void readRecords() throws FileNotFoundException {
        Scanner read = new Scanner(new File("C:\\Users\\robert.gillette\\Documents\\empsInput.txt"));
        while (read.hasNextLine()) {
            String[] emp = read.nextLine().split(",");
            ArrayList<String> temp = new ArrayList<>();
            for (int j = 0; j < emp.length; j++) {
                System.out.print(emp[j]+" ");
                temp.add(emp[j]);
            }
            records.add(temp);
            System.out.println();
        }
    }
    public void addSalary(int id) {
        int old=0;
        for (int i = 0; i < records.size(); i++) {
            if (id == Integer.parseInt(records.get(i).get(1))) {
                old = Integer.parseInt(records.get(i).get(2));
                records.get(i).set(2,Integer.toString(Integer.parseInt(records.get(i).get(2))+5000));
            }
        }
        System.out.println(old);
        System.out.println(old+5000);
    }
    public void addSalAll() throws FileNotFoundException {
        int old = 0;
        for (int i = 0; i < records.size(); i++) {
            old = Integer.parseInt(records.get(i).get(2));
            records.get(i).set(2,Integer.toString(Integer.parseInt(records.get(i).get(2))+2000));
            System.out.println("Old: "+old);
            System.out.println("New: "+(old+2000));
        }
        PrintWriter write = new PrintWriter("C:\\Users\\robert.gillette\\Documents\\empsOutput.txt");
        write.println(records);
        write.close();
    }
    public void addSalAll2() throws FileNotFoundException {
        int old = 0;
        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < records.get(i).size(); j++) {
                if (!checkAlpha(records.get(i).get(j)) && Integer.parseInt(records.get(i).get(j)) > 1200) {
                    old = Integer.parseInt(records.get(i).get(2));
                    records.get(i).set(2,Integer.toString(Integer.parseInt(records.get(i).get(j))+2000));
                    System.out.println("Old: "+old);
                    System.out.println("New: "+(old+2000));
                    break;
                }
            }
        }
        PrintWriter write = new PrintWriter("C:\\Users\\robert.gillette\\Documents\\empsOutput.txt");
        write.println(records);
        write.close();
    }
    public boolean checkAlpha(String s) {
        boolean contains = false;
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (String a : alpha) {
            if (s.contains(a)) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}

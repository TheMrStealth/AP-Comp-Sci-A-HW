package Collegeboard;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author robert.gillette
 */

public class CerealRunner2 {
    private ArrayList<Cereal> cereals;
    public CerealRunner2(String filePath) {
        cereals = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File("C:\\Users\\robert.gillette\\IdeaProjects\\AP-Comp-Sci-A-HW\\src\\Collegeboard\\cerealSubset.csv"));
            while (in.hasNextLine()) {
                String[] data = in.nextLine().split(",");
                cereals.add(new Cereal(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]),Double.parseDouble(data[4])));
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        int numC = cereals.size();
        System.out.println(numC + " records created.");
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\robert.gillette\\IdeaProjects\\AP-Comp-Sci-A-HW\\src\\Collegeboard\\cerealSubset.csv";
        CerealRunner2 CR2 = new CerealRunner2(filePath);
    }
}

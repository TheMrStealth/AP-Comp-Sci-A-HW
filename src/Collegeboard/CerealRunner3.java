package Collegeboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author robert.gillette
 */

public class CerealRunner3 {

    private static ArrayList<Cereal> cereals = new ArrayList<Cereal>();

    public CerealRunner3(String filePath)
    {
        try
        {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();
                String[] myArray = myStr.split(",");
                String name = myArray[0];
                int calories = Integer.parseInt(myArray[1]);
                double fiber = Double.parseDouble(myArray[2]);
                double carbs = Double.parseDouble(myArray[3]);
                double cups = Double.parseDouble(myArray[4]);
                cereals.add(new Cereal(name, calories, fiber, carbs, cups));
            } //close while
            scan.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        int numCereals = cereals.size();
        System.out.println( numCereals + " records created.");
    }
    public static void main(String [] args)
    {
        String path = "C:\\Users\\robert.gillette\\IdeaProjects\\AP-Comp-Sci-A-HW\\src\\Collegeboard\\cerealSubset.csv";
        CerealRunner3 cr = new CerealRunner3(path );
        ArrayList<Cereal> results = filterCarbsPerCup(17, 18);
        String names = "[";
        for(Cereal c : results)
            names += c.getName() + ", ";
        if(names.length() > 2)
            names = names.substring(0, names.length() - 2) + "]";
        else
            names += "]";

        //Test Part A
        System.out.println("\n*****Filter Carbs Per Cup Results*****");
        System.out.println("Expected results: [Cinnamon Toast Crunch, Frosted "+
                "Mini-Wheats, Fruit & Fibre Dates; Walnuts; and Oats, Fruity Pebbles, "+
                "Grape Nuts Flakes, Just Right Crunchy  Nuggets, Life, Nutri-grain "+
                "Wheat, Wheaties]");
        System.out.println("\nActual results:   " + names);

//      Test Part B
      System.out.println("\n*****Highest Percent Fiber Results*****");
      System.out.println("Expected results: All-Bran with Extra Fiber");
      System.out.println("Actual results:   " + highestPercentFiber().getName());


//      Test Part C
      System.out.println("\n*****Find Net Carbs Results*****");
      Cereal testCereal = new Cereal("Golden Crisp",100,0,11,0.88);
      System.out.println("Expected results: 11.0");
      System.out.println("Actual results:   " + findNetCarbsPerCup(testCereal));

//      Part D
      for (Cereal c : cereals) {
          if (c.getName().equals("All-Bran with Extra Fiber") || c.getName().equals("Apple Jacks") || c.getName().equals("Cocoa Puffs")) {
              System.out.println("\nCereal: "+c.getName()+", Net Carbs: " + findNetCarbsPerCup(c));
          }
      }
    }

    public static ArrayList<Cereal> filterCarbsPerCup(int min, int max) {
        ArrayList<Cereal> result = new ArrayList<>();
        for (Cereal C : cereals) {
            double carbsPerCup = C.getCarbs()/C.getCups();
            if (carbsPerCup >= min && carbsPerCup <= max) {
                result.add(C);
            }
        }
        return result;
    }
    public static Cereal highestPercentFiber() {
        Cereal highest = cereals.get(0);
        for (Cereal C : cereals) {
            if (C.getFiber()/C.getCalories() > highest.getFiber()/highest.getCalories()) {
                highest = C;
            }
        }
        return highest;
    }
    public static double findNetCarbsPerCup(Cereal c) {
        return (c.getCarbs()/c.getCups() - c.getFiber()/c.getCups());
    }
}

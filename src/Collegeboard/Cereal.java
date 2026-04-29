package Collegeboard;

/**
 *
 * @author robert.gillette
 */

public class Cereal {
    private String name;
    private double calories;
    private double fiber;
    private double carbs;
    private double cups;

    public Cereal() {
        name = null;
        calories = 0;
        fiber = 0;
        carbs = 0;
        cups = 0;
    }
    public Cereal(String name, double calories, double fiber, double carbs, double cups) {
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbs = carbs;
        this.cups = cups;
    }
    public String getName() {
        return name;
    }
    public double getCalories() {
        return calories;
    }
    public double getFiber() {
        return fiber;
    }
    public double getCarbs() {
        return carbs;
    }
    public double getCups() {
        return cups;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public void setFiber(double fiber) {
        this.fiber = fiber;
    }
    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
    public void setCups(double cups) {
        this.cups = cups;
    }
}

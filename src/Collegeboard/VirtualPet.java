package Collegeboard;

/**
 *
 * @author robert.gillette
 */

public class VirtualPet {
    private int energy;
    private int weight;
    private int happiness;
    private int years;
    private int months;
    private String name;

    public VirtualPet(String name) {
        this.name = name;
        happiness = 10;
        weight = 5;
        energy = 10;
        years = 0;
        months = 0;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "Bubba's Information: \nEnergy: "+energy+"\nHappiness: "+happiness+"\nWeight: "+weight+"\nAge: "+years+" years and "+months+" months";
    }
    public void feed() {
        if (energy <= 10 && energy >= 0) {
            energy += 1;
            weight += 1;
        }
    }
    public int getEnergyLevel() {
        return energy;
    }
    public int getHappinessLevel() {
        return happiness;
    }
    public void play() {
        if (happiness >= 0 && happiness <= 10 && weight >= 5) {
            happiness += 1;
            weight -= 1;
        }
    }
    public void updateStatus() {
        if (happiness >= 0 && happiness <= 10 && energy >= 0 && energy <= 10) {
            happiness -= 1;
            energy -= 1;
            months++;
            if (months == 12) {
                years++;
                months = 0;
            }
        }
    }
}
class Food {
    private String name;
    private int ELinc;
    private int HLinc;
    private int Winc;

    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain) {
        this.name = name;
        ELinc = energyIncrease;
        HLinc = happinessIncrease;
        Winc = weightGain;
    }

}

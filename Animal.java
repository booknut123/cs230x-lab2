
/**
 * Class representing an Animal object with attributes type, name, weight, foodType, numberOfFeeds, and quantityPerFeed. Various getter/setter methods plus methods amountEatenPerFeed, amountEatenPerDay, and frequencyOfFeeds.
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class Animal
{
    private String type; // the type of animal
    private String name; // the name of the animal
    private double weight; // the weight of the animal (in pounds)
    private String foodType; // the type of food this animal eats
    private int numberOfFeeds; // the number of feeds this animal has every day
    private double quantityPerFeed; // the % of body weight that the animal needs to eat at each feed

    /**
     * Animal constructor with all params.
     * 
     * @param type, name, weight, foodType, numberOfFeeds, quantityPerFeed
     */
    public Animal(String type, String name, double weight, String foodType, int numberOfFeeds, double quantityPerFeed) {
        this.type = type;
        this.name =  name;
        this.weight = weight;
        this.foodType = foodType;
        this.numberOfFeeds = numberOfFeeds;
        this.quantityPerFeed = quantityPerFeed;
    }

    /**
     * Animal constructor with two params (empty constructor)
     * 
     * @param type, name
     */
    public Animal(String type, String name) {
        this(type, name, 0, "", 1, 0.05);
    }

    /**
     * Returns the amount (lbs) of food eaten each feed by this Animal
     */
    public double amountEatenPerFeed() {
        return quantityPerFeed * weight;
    }

    /**
     * Returns the amount (lbs) of food eaten each day by this Animal
     */
    public double amountEatenPerDay(){
        return amountEatenPerFeed() * numberOfFeeds;
    }

    /**
     * Returns the number of hours between feeds in a 24h day
     */
    public double frequencyOfFeeds() {
        return 24.0/numberOfFeeds;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getNumberOfFeeds() {
        return numberOfFeeds;
    }

    public double getQuantityPerFeed() {
        return quantityPerFeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setNumberOfFeeds(int numberOfFeeds) {
        this.numberOfFeeds = numberOfFeeds;
    }

    public void setQuantityPerFeed(double quantityPerFeed) {
        this.quantityPerFeed = quantityPerFeed;
    }

    public String toString() {
        return name + " is a(n) " + type + ". \n Weight: " + weight + "\n Food: " + foodType + "\n Schedule: " + amountEatenPerFeed() + " lb(s) every " + frequencyOfFeeds() + " hours.";
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("armadillo","Charlotte", 15.0, "grain", 4, 0.05);
        Animal animal2 =  new Animal("hedgehog","Heidi");
        
        System.out.println(animal1);
        System.out.println(animal2);
        
        System.out.println("Expected type: hedgehog | Computed type: " + animal2.getType());
        System.out.println("Expected name: Heidi | Computed name: " + animal2.getName());
        animal2.setWeight(1.0);
        System.out.println("Expected weight: 1.0 | Computed weight: " + animal2.getWeight());
        animal2.setFoodType("grass");
        System.out.println("Expected food: grass | Computed food: " + animal2.getFoodType());
        animal2.setNumberOfFeeds(10);
        System.out.println("Expected numFeeds: 10 | Computed numFeeds: " + animal2.getNumberOfFeeds());
        animal2.setQuantityPerFeed(0.2);
        System.out.println("Expected quantity: 0.2 | Computer quantity: " + animal2.getQuantityPerFeed());
    }
}

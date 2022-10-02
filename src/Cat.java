// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private String favfood;

    // constructor
    public Cat(String catName, int catAge, double catWeight, String catFood) {
        name = catName;
        age = catAge;
        weight = catWeight;
        favfood = catFood;
    }

    // method that introduces the Cat
    public void introduce() {
        String agediff;
        if (age < 7) {
            agediff = "younger cat";
        } else {
            agediff = "older cat";
        }
        System.out.println("Hello my name is " + name + " and I am " + agediff);
    }
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Favorite food: " + favfood);
    }
}



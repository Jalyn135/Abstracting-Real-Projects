/**
 * Tester class for the Oven and Door classes.
 */
public class App {
    public static void main(String[] args) {
        // Create objects using both constructors
        Oven defaultOven = new Oven();
        Oven customOven = new Oven(200, "Large", "Black", "Dirty", "Gas", new Door("Damaged"));

        // Print objects
        System.out.println(defaultOven);
        System.out.println(customOven);

        // Call behavior methods with parameters
        defaultOven.heatUp(50);
        customOven.heatUp(100);

        // Call behavior methods without parameters
        defaultOven.bakeFood();
        customOven.selfClean();

        // Call getter and setter methods
        System.out.println("The color of the default oven is: " + defaultOven.getColor());
        defaultOven.setColor("Red");
        System.out.println("The new color of the default oven is: " + defaultOven.getColor());
    }
}
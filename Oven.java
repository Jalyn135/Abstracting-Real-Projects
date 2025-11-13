/**
 * Represents an Oven with various properties and behaviors.
 */
public class Oven {
    private int temperature;
    private String size;
    private String color;
    private String cleanliness;
    private String energySource;
    private Door doorCondition;

    /**
     * Default constructor for Oven.
     * Initializes the oven with default values.
     */
    public Oven() {
        this.temperature = 0;
        this.size = "Medium";
        this.color = "Silver";
        this.cleanliness = "Clean";
        this.energySource = "Electric";
        this.doorCondition = new Door("Intact");
    }

    /**
     * Parameterized constructor for Oven.
     * 
     * @param temperature   The temperature of the oven.
     * @param size          The size of the oven.
     * @param color         The color of the oven.
     * @param cleanliness   The cleanliness of the oven.
     * @param energySource  The energy source of the oven.
     * @param doorCondition The condition of the oven door.
     */
    public Oven(int temperature, String size, String color, String cleanliness, String energySource, Door doorCondition) {
        this.temperature = temperature;
        this.size = size;
        this.color = color;
        this.cleanliness = cleanliness;
        this.energySource = energySource;
        this.doorCondition = doorCondition;
    }

    // Getters and setters

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(String cleanliness) {
        this.cleanliness = cleanliness;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public Door getDoorCondition() {
        return doorCondition;
    }

    public void setDoorCondition(Door doorCondition) {
        this.doorCondition = doorCondition;
    }

    // Behavior methods

    public void heatUp(int increment) {
        this.temperature += increment;
        System.out.println("The oven is heating up. New temperature: " + this.temperature + "°C");
    }

    public void bakeFood() {
        this.temperature = 180; // Default baking temperature
        this.cleanliness = "Dirty";
        System.out.println("Baking food... Temperature set to " + this.temperature + "°C. Cleanliness: " + this.cleanliness);
    }

    public void coolDown() {
        this.temperature = 0;
        System.out.println("The oven is cooling down. Temperature: " + this.temperature + "°C");
    }

    public void selfClean() {
        this.cleanliness = "Clean";
        System.out.println("The oven is self-cleaning. Cleanliness: " + this.cleanliness);
    }

    @Override
    public String toString() {
        return "Oven [temperature=" + temperature + ", size=" + size + ", color=" + color + ", cleanliness=" + cleanliness
                + ", energySource=" + energySource + ", doorCondition=" + doorCondition + "]";
    }
}
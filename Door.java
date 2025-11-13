/**
 * Represents the door of an Oven.
 */
public class Door {
    private String condition;

    /**
     * Constructor for Door.
     * 
     * @param condition The condition of the door.
     */
    public Door(String condition) {
        this.condition = condition;
    }

    /**
     * Gets the condition of the door.
     * 
     * @return The condition of the door.
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the condition of the door.
     * 
     * @param condition The new condition of the door.
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Door [condition=" + condition + "]";
    }
}
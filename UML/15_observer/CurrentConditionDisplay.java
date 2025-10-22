public class CurrentConditionDisplay implements Observer {
    private String currentConditions;

    @Override
    public void update(String message) {
        this.currentConditions = message;
    }

    public void display() {
        System.out.println("Current conditions: " + currentConditions);
    }
    
}

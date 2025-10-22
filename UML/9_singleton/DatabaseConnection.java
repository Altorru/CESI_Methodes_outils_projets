public class DatabaseConnection {
    private static DatabaseConnection instance;
    private double value;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
            instance.value = Math.random();
        }
        return instance;
    }

    public double getValue() {
        return value;
    }
}

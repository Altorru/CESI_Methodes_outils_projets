public class main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("db1 value = " + db1.getValue());
        System.out.println("db2 value = " + db2.getValue());
        System.out.println("Same instance: " + (db1 == db2));
    }
}

public class Main {
    public static void main(String[] args) {
        // Legacy object from external library
        LegacyLibrary legacy = new LegacyLibrary("Hugo Viaud hugo.viaud@example.com");

        // Adapter exposes IDataReader interface
        IDataReader reader = new DataAdapter(legacy);

        // Client code uses the expected interface without depending on legacy method names
        System.out.println("Prénom: " + reader.getPrenom());
        System.out.println("Nom: " + reader.getNom());
        System.out.println("Email: " + reader.getEmail());
    }
}
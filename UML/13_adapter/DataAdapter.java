public class DataAdapter implements IDataReader {
    private final LegacyLibrary legacy;

    public DataAdapter(LegacyLibrary legacy) {
        this.legacy = legacy;
    }

    @Override
    public String getPrenom() {
        String[] parts = legacy.fetchCoordonees().split(" ");
        return parts.length > 0 ? parts[0] : "";
    }

    @Override
    public String getNom() {
        String[] parts = legacy.fetchCoordonees().split(" ");
        return parts.length > 1 ? parts[1] : "";
    }

    @Override
    public String getEmail() {
        String[] parts = legacy.fetchCoordonees().split(" ");
        return parts.length > 2 ? parts[2] : "";
    }
}
public class LegacyLibrary {
    // Simulates an old library with incompatible method names
    private String coordonees;

    public LegacyLibrary(String coordonees) {
        this.coordonees = coordonees;
    }

    // Old method names
    public String fetchCoordonees() {
        return coordonees;
    }
}
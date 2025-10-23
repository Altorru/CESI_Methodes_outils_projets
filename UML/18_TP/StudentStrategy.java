public class StudentStrategy implements StrategieReduction {
    @Override
    public double appliquerReduction(double prix) {
        return prix * 0.8; // 20% de réduction pour les étudiants
    }
    
}

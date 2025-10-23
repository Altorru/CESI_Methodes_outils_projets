public class VipStrategy implements StrategieReduction {
    @Override
    public double appliquerReduction(double prix) {
        return prix * 0.7; // 30% de réduction pour les VIP
    }
    
}

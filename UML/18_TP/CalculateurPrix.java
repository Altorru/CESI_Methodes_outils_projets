public class CalculateurPrix {
    public double calculerPrix(double prix, String typeClient) {
        if (typeClient.equals("ETUDIANT")) {
            return prix * 0.8;
        } else if (typeClient.equals("VIP")) {
            return prix * 0.7;
        } else {
            return prix;
        }
    }
}
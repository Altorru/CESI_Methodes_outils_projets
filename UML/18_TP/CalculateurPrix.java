import java.util.ArrayList;
import java.util.List;

public class CalculateurPrix implements Subject {
    // ----- OLD METHOD -----
    // public double calculerPrix(double prix, String typeClient) {
    //     if (typeClient.equals("ETUDIANT")) {
    //         return prix * 0.8;
    //     } else if (typeClient.equals("VIP")) {
    //         return prix * 0.7;
    //     } else {
    //         return prix;
    //     }
    // }
    // ----------------------

    private final List<Observer> observers;

    public CalculateurPrix() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String strategy, double prixInitial, double prixFinal) {
        for (Observer observer : observers) {
            observer.update(strategy, prixInitial, prixFinal);
        }
    }

    public double calculerPrix(double prix, StrategieReduction strategie) {
        double prixFinal = strategie.appliquerReduction(prix);
        notifyObservers(strategie.getClass().getSimpleName(), prix, prixFinal);
        return prixFinal;
    }
}

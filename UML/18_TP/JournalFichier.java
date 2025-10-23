import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JournalFichier implements Observer {
    private BufferedWriter writer;

    public JournalFichier(String cheminFichier) {
        try {
            writer = new BufferedWriter(new FileWriter(cheminFichier, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String strategy, double prixInitial, double prixFinal) {
        try {
            writer.write("Stratégie appliquée : " + strategy);
            writer.newLine();
            writer.write("Prix initial : " + prixInitial);
            writer.newLine();
            writer.write("Prix final après réduction : " + prixFinal);
            writer.newLine();
            writer.write("========================================");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
        }
    }
}

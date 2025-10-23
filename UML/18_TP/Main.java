public class Main {
    public static void main(String[] args) {
        // --- OLD METHOD ---
        // CalculateurPrix calculateur = new CalculateurPrix();
        // System.out.println("Prix étudiant : " + calculateur.calculerPrix(100, "ETUDIANT"));
        // System.out.println("Prix VIP : " + calculateur.calculerPrix(100, "VIP"));
        // ------------------

        // --- NEW METHOD USING STRATEGY PATTERN ---
        // CalculateurPrix calculateur = new CalculateurPrix();
        // System.out.println("Prix étudiant : " + calculateur.calculerPrix(100, new StudentStrategy()));
        // System.out.println("Prix VIP : " + calculateur.calculerPrix(100, new VipStrategy()));

        // --- NEW METHOD USING OBSERVER PATTERN ---
        CalculateurPrix calculateur = new CalculateurPrix();
        AfficheurConsole afficheur = new AfficheurConsole();
        JournalFichier journal = new JournalFichier("journal.txt");
        calculateur.attach(afficheur);
        calculateur.attach(journal);
        calculateur.calculerPrix(100, new StudentStrategy());
        calculateur.calculerPrix(100, new VipStrategy());
    }
}
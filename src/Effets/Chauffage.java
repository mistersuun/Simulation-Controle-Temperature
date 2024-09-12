package Effets;

public class Chauffage {
    private boolean actif;

    public void demarrer() {
        if (!actif) {
            actif = true;
            System.out.println("Chauffage démarré.");
        }
    }

    public void arreter() {
        if (actif) {
            actif = false;
            System.out.println("Chauffage arrêté.");
        }
    }

    public boolean estActif() {
        return actif;
    }
}

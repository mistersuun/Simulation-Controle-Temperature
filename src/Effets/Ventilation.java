package Effets;

public class Ventilation {
    private boolean actif;

    public void demarrer() {
        if (!actif) {
            actif = true;
            System.out.println("Ventilation démarrée.");
        }
    }

    public void arreter() {
        if (actif) {
            actif = false;
            System.out.println("Ventilation arrêtée.");
        }
    }

    public boolean estActif() {
        return actif;
    }
}

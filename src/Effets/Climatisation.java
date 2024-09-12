package Effets;

public class Climatisation {
    private boolean actif;

    public void demarrer() {
        if (!actif) {
            actif = true;
            System.out.println("Climatisation démarrée.");
        }
    }

    public void arreter() {
        if (actif) {
            actif = false;
            System.out.println("Climatisation arrêtée.");
        }
    }

    public boolean estActif() {
        return actif;
    }
}


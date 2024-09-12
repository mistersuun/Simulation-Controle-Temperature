import java.util.ArrayList;
import java.util.List;

public abstract class Capteur {
    protected List<Observateur> observateurs = new ArrayList<>();
    protected float valeur;

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void retirerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(this);
        }
    }

    public abstract void setValeur(float nouvelleValeur);
    public abstract float obtenirValeur();
}

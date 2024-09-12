public class CapteurCO2 extends Capteur {

    @Override
    public void setValeur(float nouvelleValeur) {
        this.valeur = nouvelleValeur;
        notifierObservateurs();
    }

    @Override
    public float obtenirValeur() {
        return this.valeur;
    }

    public void setCO2(float co2) {
        setValeur(co2);
    }

    public float getCO2() {
        return obtenirValeur();
    }
}

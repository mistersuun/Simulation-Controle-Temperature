public class CapteurTemp extends Capteur {

    @Override
    public void setValeur(float nouvelleValeur) {
        this.valeur = nouvelleValeur;
        notifierObservateurs();
    }

    @Override
    public float obtenirValeur() {
        return this.valeur;
    }

    public void setTemp(float temp) {
        setValeur(temp);
    }

    public float getTemp() {
        return obtenirValeur();
    }
}

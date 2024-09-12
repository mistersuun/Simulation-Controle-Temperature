import Effets.Chauffage;
import Effets.Climatisation;
import Effets.Ventilation;

public class Controleur implements Observateur {
    private float tempCible = 22.0f;
    private float co2Max = 1000.0f;
    private Chauffage chauffage;
    private Climatisation climatisation;
    private Ventilation ventilation;

    public Controleur(Chauffage chauffage, Climatisation climatisation, Ventilation ventilation) {
        this.chauffage = chauffage;
        this.climatisation = climatisation;
        this.ventilation = ventilation;
    }

    @Override
    public void mettreAJour(Capteur capteur) {
        if (capteur instanceof CapteurTemp) {
            float temperature = capteur.obtenirValeur();
            System.out.println("--> Contrôleur : nouvelle valeur reçue : mesure de température = " + temperature + "°C");
            if (temperature < tempCible) {
                chauffage.demarrer();
                climatisation.arreter();
            } else if (temperature > tempCible) {
                climatisation.demarrer();
                chauffage.arreter();
            } else {
                chauffage.arreter();
                climatisation.arreter();
                System.out.println("Température stable.");
            }
        } else if (capteur instanceof CapteurCO2) {
            float co2 = capteur.obtenirValeur();
            System.out.println("--> Contrôleur : nouvelle valeur reçue : mesure de CO2 = " + co2 + " ppm");
            if (co2 > co2Max) {
                ventilation.demarrer();
            } else {
                ventilation.arreter();
                System.out.println("Niveau de CO2 normal.");
            }
        }
    }
}

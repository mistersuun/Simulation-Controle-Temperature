import Effets.Chauffage;
import Effets.Climatisation;
import Effets.Ventilation;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        CapteurTemp capteurTemp = new CapteurTemp();
        CapteurCO2 capteurCO2 = new CapteurCO2();

        Chauffage chauffage = new Chauffage();
        Climatisation climatisation = new Climatisation();
        Ventilation ventilation = new Ventilation();

        Controleur controleur = new Controleur(chauffage, climatisation, ventilation);

        capteurTemp.ajouterObservateur(controleur);
        capteurCO2.ajouterObservateur(controleur);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Entrez une nouvelle température : ");
            float temp = scanner.nextFloat();
            capteurTemp.setTemp(temp);

            System.out.print("Entrez une nouvelle concentration de CO2 : ");
            float co2 = scanner.nextFloat();
            capteurCO2.setCO2(co2);
        }

        scanner.close();
    }
}

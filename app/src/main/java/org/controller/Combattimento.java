import org.model.entity.Creatura;
import org.model.entity.Personaggio;

public class Combattimento {
    private Creatura[] alleati;
    private Creatura[] nemici;
    public Combattimento(Creatura[] alleati, Creatura[] nemici) {
        this.alleati = alleati;
        this.nemici = nemici;
    }

    public Creatura[] getAlleati() {
        return alleati;
    }

    public Creatura[] getNemici() {
        return nemici;
    }

    public boolean teamSconfitto(Creatura[] gruppo) {
        for (Creatura creatura : gruppo) {
            if (creatura.isVivo()) {
                return false; 
            }
        }
        return true; 
    }

    public void inizioCombattimento() {
        int i = (int) (Math.random() * 2); // Genera un numero casuale tra 0 e 1, per determinare se inizieranno gli alleati o i nemici
        boolean 
        while (!teamSconfitto(alleati) && !teamSconfitto(nemici)) {
            if (i == 0) {
                // Turno degli alleati
                for (Creatura alleato : alleati) {
                    if (alleato.isVivo()) {
                        if (alleato instanceof Personaggio) {
                    }
                }
            } else {
                // Turno dei nemici
                for (Creatura nemico : nemici) {
                    if (nemico.isVivo()) {
                        // Logica per scegliere un alleato da attaccare e eseguire l'attacco
                        Creatura alleato = scegliAlleatoCasuale(alleati);
                        if (alleato != null) {
                            // Esegui l'attacco del nemico sull'alleato
                            // nemico.attacca(alleato);
                        }
                    }
                }
            }
            i = 1 - i; // Alterna il turno tra alleati e nemici
        }
    }
}

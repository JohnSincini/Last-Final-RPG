import org.controller.Squadra;
import org.model.entity.Creatura;

public class CombattimentoDueTeam {
    private Squadra squadraAlleati;
    private Squadra squadraNemici;
    private int turnoCorrente = 0; 
    private int numeroPartecipanti;
    public CombattimentoDueTeam(Squadra alleati, Squadra nemici) {
        this.squadraAlleati = alleati;
        this.squadraNemici = nemici;
        this.numeroPartecipanti = alleati.getNumeroMembriVivi() + nemici.getNumeroMembriVivi();
    }

    public void fineTurno() {
        turnoCorrente++;
    }
    
    public Creatura[] getAlleati() {
        return squadraAlleati.getMembri();
    }

    public Creatura[] getNemici() {
        return squadraNemici.getMembri();
    }

    private void turnoAlleati(){

    }
//TODO
     private void turnoNemici(){}


    public void inizioCombattimento() {
        int i = (int) (Math.random() * 2); // Genera un numero casuale tra 0 e 1, per determinare il team che agisce per primo
            if ((turnoCorrente + i)%2 == 0) {
                turnoAlleati();
            } else {
                turnoNemici();
            }
    }
}

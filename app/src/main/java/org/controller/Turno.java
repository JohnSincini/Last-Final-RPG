import org.controller.Squadra;
import org.model.entity.Creatura;
import org.controller.CombattimentoDueTeam;

public class Turno {
    private CombattimentoDueTeam combattimento;
    private Creatura creaturaCorrente;

    public Turno(CombattimentoDueTeam combattimento, Creatura creaturaCorrente) {
        this.combattimento = combattimento;
        this.creaturaCorrente = creaturaCorrente;
    }

    public CombattimentoDueTeam getCombattimento() {
        return combattimento;
    }

    public Creatura getCreaturaCorrente() {
        return creaturaCorrente;
    }

    private Squadra getSquadraNemica() {
        if (combattimento.getAlleati().equals(creaturaCorrente.getSquadra())) {
            return combattimento.getNemici();
        }
            return combattimento.getAlleati();
    }

    private Squadra getSquadraAlleata() {
        if (combattimento.getAlleati().equals(creaturaCorrente.getSquadra())) {
            return combattimento.getAlleati();
        }
            return combattimento.getNemici();
    }  

    

    
}

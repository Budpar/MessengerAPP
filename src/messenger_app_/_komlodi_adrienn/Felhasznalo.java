package messenger_app_._komlodi_adrienn;

import java.util.Set;
import java.util.TreeSet;

public class Felhasznalo {
    private String email;
    private String felhasznalonev;
    private Set<Uzenet> uzenetB;
    private Set<Uzenet> uzenetK;

    public Felhasznalo(String email, String felhasznalonev) {
        this.email = email;
        this.felhasznalonev = felhasznalonev;
        this.uzenetB = new TreeSet<>();
        this.uzenetK = new TreeSet<>();
    }

    public void ujUzenetB(Uzenet uzenet){
        this.uzenetB.add(uzenet);
    }
    
    public void ujUzenetK(Uzenet uzenet){
        this.uzenetK.add(uzenet);
    
   }

    @Override
    public String toString() {
        return this.felhasznalonev;
    }
    public String uzenofal(){
        String utUz = "";
        if(this.uzenetB != null){
            utUz += this.uzenetB.toString();
        }
        if(this.uzenetK != null){
            utUz += this.uzenetK.toString();
        }
    return utUz;
    }
}

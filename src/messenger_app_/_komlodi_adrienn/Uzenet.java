package messenger_app_._komlodi_adrienn;

public class Uzenet implements Comparable<Uzenet>{
    private Felhasznalo felado;
    private Felhasznalo cimzett;
    private String uzenet;

    public Uzenet(Felhasznalo felado, Felhasznalo cimzett, String uzenet) {
        this.felado = felado;
        this.cimzett = cimzett;
        this.uzenet = uzenet;
    }

    @Override
    public String toString() {
        return  "Feladó: " + felado + " \nUzenet: " + uzenet + "\n"; 
    }

    @Override
    public int compareTo(Uzenet t) {
        return this.felado.toString().compareTo(t.felado.toString());
    }
    
}

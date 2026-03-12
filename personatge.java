import java.util.*;

public class personatge {
    private String nom;
    private int edat;
    private int forca;
    private int destresa;
    private int constitucio;
    private int inteligencia;
    private int saviesa;
    private int carisma;
    private double salut;
    private double mana;
    private double salutMax;
    private double manaMax;

    private int energia = 0;
    private boolean habilitatEspecial = false;
    private arma armaEquipada;
    private ArrayList<arma> inventari = new ArrayList<>();
    private boolean defensat = false;

    public personatge (String nom, int edat, int forca, int destresa, int constitucio, int inteligencia, int saviesa, int carisma) {
        this.nom = nom;
        this.edat = edat;
        this.forca = forca;
        this.destresa= destresa;
        this.constitucio = constitucio;
        this.inteligencia = inteligencia;
        this.saviesa = saviesa;
        this.carisma = carisma;
        this.salutMax = constitucio * 50;
        this.manaMax = inteligencia * 30;
        this.salut = salutMax;
        this.mana = manaMax;
    
        inventari.add(new arma("Espasa Llarga", tipusarma.ESPASA, 15, false));
    }
}

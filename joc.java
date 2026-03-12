import java.util.*;

public class joc {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<personatge> personatges = new ArrayList<>();

    public static void main(String[] args) {
        joc programa = new joc();
        programa.programa();
    }
    
    public void programa() {

        int op;

        do {

            System.out.println("\n===== MENU RPG =====");
            System.out.println("1. Crear personatge");
            System.out.println("2. Combat 1 vs 1");
            System.out.println("0. Sortir");

            op = sc.nextInt();

            if (op == 1) {
                crearPersonatge();
            }

            if (op == 2) {
                combat();
            }

        } while (op != 0);
    }
    public void crearPersonatge() {

    }
    public void combat() {

    }
    public void torn(personatge atacant, personatge defensor) {

        System.out.println("\nTorn de " + atacant.getNom());

        System.out.println("1. Atacar");
        System.out.println("2. Defensar");
        System.out.println("3. Habilitat especial");

        int op = sc.nextInt();

        if (op == 1) {
            atacant.atacar(defensor);
        }

        if (op == 2) {
            atacant.defensar();
        }

        if (op == 3) {
            atacant.usarHabilitatEspecial();
        }
    }
}
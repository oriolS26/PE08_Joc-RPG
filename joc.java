import java.util.*;

public class joc {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<personatge> personatges = new ArrayList<>();

    public static void main(String[] args) {

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
}
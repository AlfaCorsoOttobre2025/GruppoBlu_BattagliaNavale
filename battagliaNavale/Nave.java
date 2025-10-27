
package battagliaNavale;
import java.util.Scanner;
import java.util.Arrays;

public class Nave{

    static int len; // lunghezza nave
    static int colpiRimanenti; 
    static String[] coord; // coordinate nave
    static boolean[] colpi; // booleano di punti colpiti

    public static void initNave (int len) { // inizializzazione dei parametri nave in base alla sua lunghezza
        coord = new String[len]; 
        colpi = new boolean[len];
        colpiRimanenti = len;
    }

    public static int attacco (String inputAttack) { 
        int stato = 0; // 0 non colpito; 1 colpito; 2 colpito e affondato.
        try {
            for (int i=0; i<len; i++) {
                if (coord[i].equals(inputAttack)) {
                    colpiRimanenti--;
                    colpi[i]=true;
                    stato = 1;
                    break;
                }
            }

            if (stato==1) {
                if (colpiRimanenti==0) {
                    stato=2;
                }
            }

        } catch (Exception e){
            String mess = e.getMessage();
                System.err.println(mess);
                System.exit(0);
        }
        return stato;        
    }
}
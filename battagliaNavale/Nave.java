
package battagliaNavale;
import java.util.Scanner;
import java.util.Arrays;

public class Nave{

    static int len; // lunghezza nave
    static int colpiRimanenti; 
    static String[] coord; // coordinate nave
    static boolean[] colpi; // booleano di punti colpiti
    static final String letters = "ABCDEFGHIJ";

    public String invertParseCoordLetter(int [] numericCoord){
		//
        String coordinata = letters.charAt(numericCoord[0])+"-"+letters.charAt(numericCoord[1]);
		return coordinata;
	}

    public void initNave (int len, int[] posizione1; boolean orientamento) { // inizializzazione dei parametri nave in base alla sua lunghezza
        coord = new String[len];
        colpi = new boolean[len]; //di default a false
        colpiRimanenti = len;
        if (orientamento) { //vertical
            for (int i=0; i<len; i++) {
                int[] pos = {posizione1[0]+i,posizione1[1]};
                coord[i]=invertParseCoordLetter(pos);
            }   
        } else {
            for (int i=0; i<len; i++) {
                int[] pos = {posizione1[0],posizione1[1]}+i;
                coord[i]=invertParseCoordLetter(pos);
            }
        }
        
    }

    public int attacco (String inputAttack) { 
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
/*
dato un array di 100 elementi generato casualmente con interi da
0 a 100 ed un numero inserito dall'utente, stampare:
- se il numero è presente nell'array
- quante volte è ripetuto
- in che posizioni posso trovare il numero
 */
import java.util.Scanner;
import java.util.Arrays;
package GruppoBlu_BattagliaNavale;

public class Nave{

    static int hit;
    static String[] coord;
    static boolean[] colpi; //false di default

    public static void attacco (String inputAttack) { 
        try {
            int stato = 0; // 0 non colpito; 1 colpito; 2 colpito e affondato.

            for (i=0; i<coord.length(); i++) {
                if (coord[i].equals(inputAttack)) {
                    hit--;
                    colpi[i]=true;
                    stato = 1;
                    break
                }
            }

            if (colpito) {
                

                } else {

                }
                
            } else {
                System.out.print("Nave mancata.")
            }

        } catch (Exception e){
            String mess = e.getMessage();
                System.err.println(mess);
                System.exit(0);
        }
        return stato;
    }
}
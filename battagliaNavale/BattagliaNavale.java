package battagliaNavale;
import BattagliaNavale.Board;
import BattagliaNavale.Nave;

import java.util.Scanner;
public class BattagliaNavale {
    public static void main(String[] args){
        int []tipi=Board.tipiNave ;
        final int numeroNavi=4;
        Board board_Utente=new Board();
        Board board_Computer=new Board();
        board_Computer.posizionaRandom();
        System.out.println("Giochiamo a battaglia navale!");
        inserimentoUtente(board_Utente,tipi,numeroNavi);
        board_Utente.stampaBoard();    
    }

    public static void inserimentoUtente(Board board_Utente,int[]tipi,int numeroNavi){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<numeroNavi;i++){//faccio istanziare coordinate navi dell'utente
            int grandezza=tipi[i];
            System.out.println("Inserisci coordinate");
            String cord=scanner.nextLine();
            System.out.println("Inserisci o per orizzontale, v per verticale");
            String orientamento=scanner.nextLine();
            board_Utente.posizionaNave(grandezza, cord,orientamento );
            int []indici=Board.parseCoordLetter(cord);
            System.out.println(indici.length);
            for(int j=0;j<indici.length;j++){
               System.out.println(indici[j]);
            }
        }
    }

    
    
}

package battagliaNavale;
import BattagliaNavale.Board;
import BattagliaNavale.Nave;

import java.util.Scanner;
public class BattagliaNavale {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int []tipi=Board.tipiNave ;
        int  numeroNavi=4;
        Board board_Utente=new Board();
        Board board_Computer=new Board();
        board_Computer.posizionaRandom();
        board_Utente.posizionaRandom();
        System.out.println("Giochiamo a battaglia navale!");
        for(int i=0;i<numeroNavi;i++){//faccio istanziare coordinate navi dell'utente
            int grandezza=tipi[i];
            System.out.println("Inserisci coordinate");
            String cord=scanner.nextLine();
            System.out.println("Inserisci o per orizzontale, v per verticale");
            String orientamento=scanner.nextLine();
            board_Utente.posizionaNave(grandezza, cord,orientamento );
            int []indici=Board.parseCoordLetter("A-2");
            for(int j=0;j<indici.length;i++){
                System.out.println(indici[i]);
            }
        }
        
    }
}

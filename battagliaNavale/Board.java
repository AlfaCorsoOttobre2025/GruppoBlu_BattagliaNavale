package battagliaNavale;
import battagliaNavale.Nave;
public class Board{
	static final int[] tipiNave = {2,3,3,4}; //lunghezza delle navi
	static String[] attacchi={};
	static Nave[] navi={};
	static final int dimensioniBoard = 10;
	static int punteggio =0;
	public boolean posizionaNave(int lunghezzaNave, String coord, String orientamento){
		//entra dentro board? -> si sovrappone a navi? -> true/false
		return false;
	}
	public void posizionaRandom(){
		for(int i=0; i<tipiNave.length; i++){
			//posizionaNave();
			System.out.println("Entrato");
		}
	}
	
	
	//controlla se già in attacchi
	public void attaccoCoordinata(String coord){
		int result=0;
		for(int i=0; i<navi.length; i++){
			result = navi[i].attacco(coord);
			if(result!=0){
				if(result==1){
					System.out.println("Colpito!");
				}else{
					System.out.println("Colpito e Affondato!");
					punteggio++;
				}
				break;
			}
		}
	}
	
	
	
	public void stampaBoard(){

	}
	
	public void stampaAttachi(Board boardComputer){
		/*uso la Board del computer per capire dovo sono le navi e 
		attachi di questa istanza:
		- attacchi[i] non in coord delle navi di computer -> print x
		- attacchi[i] in coord delle navi di computer -> print *
		- non in attcchi -> print?
		*/
	}

}
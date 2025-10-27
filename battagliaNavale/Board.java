package battagliaNavale;
import battagliaNavale.Nave;
public class Board{
	static final int[] tipiNave = {2,3,3,4}; //lunghezza delle navi
	static String[] attacchi={};
	static Nave[] navi={};
	static final int dimensioniBoard = 10;
	public boolean posizionaNave(int lunghezzaNave, String coord, String orientamento){
		//entra dentro board? -> si sovrappone a navi? -> true/false
	}
	public void posizionaRandom(){
		for(int i=0; i<tipiNave.length; i++){
			posizionaNave();
		}
	}
	
	
	//controlla se già in attacchi
	public void attaccoCoordinata(String coord){
		int result=0;
		for(int i=0; i<Navi; i++){
			result = navi[i].attacco(coord);
			if(result!=0){
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
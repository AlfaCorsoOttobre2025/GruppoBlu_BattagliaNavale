package battagliaNavale;
import battagliaNavale.Nave;
public class Board{
	static final int[] tipiNave = {2,3,3,4}; //lunghezza delle navi
	static String[] attacchi={};
	static Nave[] navi={};
	static final int dimensioniBoard = 10;
	static int punteggio =0;
	static final String letters = "ABCDEFGHIJ";
	public boolean posizionaNave(int lunghezzaNave, String coord, String orientamento){
		//entra dentro board? -> si sovrappone a navi? -> true/false
		boolean ori = orientamento.equals("v") ? true : false;
		int[] numericCoord(coord);
		if (inBoard(lunghezzaNave,numericCoord, ori)){
			
		}
		
		return false;
	}
	public boolean aggiungiNave(lunghezzaNave,coord, ori){
		String currentCoord={};
		boolean ok=true;
		for (int i=0; i<navi.length; i++){
			currentCoord = Arrays.copyOf(navi[i].coord,navi[i].coord.length);
			for (j=0; j<currentCoord;j++){
				if(coord.equals(currentCoord[j])){
					ok=false;
					break;
				}
			}
			if(!ok){
				break;
			}
		}
		
		if(ok){
			
		}
		return ok;
	}
	
	
	public boolean inBoard(int lunghezzaNave,int[] numericCoord, boolean ori){ //true = varticale
		boolean result=false;
		if (ori){
			if (numericCoord[0]<11 && numericCoord[0]>0 && numericCoord[1]+lunghezzaNave<11 && numericCoord[1]>0){
			result=true;
		}else{
			if (numericCoord[0]+lunghezzaNave<11 && numericCoord[0]>0 && numericCoord[1]<11 && numericCoord[1]>0){
			result=true;
		}
		
		return result;
	}
	
	public int[] parseCoordLetter(String coord){
		//A-1
		String[] info= coord.split("-");
		int coordNum = letters.indexOf(info[0])+1;
		int[] numericCoord= {coordNum, Integer.parseInt(info[1])};
		return numericCoord;
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
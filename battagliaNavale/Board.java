package battagliaNavale;
import battagliaNavale.Nave;
import java.util.Arrays;
import java.util.Random;

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
		int[] numericCoord=parseCoordLetter(coord);
		boolean result=false;
		if (inBoard(lunghezzaNave,numericCoord, ori)){
			result = aggiungiNave(lunghezzaNave,coord,numericCoord, ori);
		}
		
		return result;
	}
	public boolean aggiungiNave(int lunghezzaNave, String coord, int[] numericCoord, boolean ori){
		String[] currentCoord={};
		boolean ok=true;
		
		for (int i=0; i<navi.length; i++){
			currentCoord = Arrays.copyOf(navi[i].coord,navi[i].coord.length);
			for (int j=0; j<currentCoord.length;j++){
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
			Nave nuovaNave = new Nave();
			nuovaNave.initNave(lunghezzaNave,numericCoord, ori);
			navi= Arrays.copyOf(navi, navi.length+1);
			navi[navi.length-1]=nuovaNave;
		}
		return ok;
	}
	
	
	public boolean inBoard(int lunghezzaNave,int[] numericCoord, boolean ori){ 
		//true = varticale
		boolean result=false;
		if (ori){
			if (numericCoord[0]<11 && numericCoord[0]>0 && numericCoord[1]+lunghezzaNave<11 && numericCoord[1]>0){
				result=true;
			}
		}else{
			if (numericCoord[0]+lunghezzaNave<11 && numericCoord[0]>0 && numericCoord[1]<11 && numericCoord[1]>0){
				result=true;
			}
		}
		
		return result;
	}
	
	public static int[] parseCoordLetter(String coord){
		//A-1
		String[] info= coord.split("-");
		int coordNum = letters.indexOf(info[0])+1;
		int[] numericCoord= {coordNum, Integer.parseInt(info[1])};
		return numericCoord;
	}
	
	public void posizionaRandom(){
		Random rnd = new Random(42L);
		int counterNavi=0;
		boolean result= false;
		do{
			int idxRnd = letters.indexOf(rnd.nextInt(dimensioniBoard));
			String letter = letters.charAt(idxRnd)+"";
			int vert = rnd.nextInt(dimensioniBoard)+1;
			String coord= letter+"-"+vert;
			String orientamento = (rnd.nextInt(dimensioniBoard)+1)%2 ==0 ? "v" :"o";
			result= posizionaNave(tipiNave[counterNavi], coord, orientamento);
			if(result){
				counterNavi++;
			}
			
		}while(counterNavi != tipiNave.length);
		
		
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
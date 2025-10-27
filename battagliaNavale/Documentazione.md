# Battaglia navale


## Classe Nave

La classe Nave crea un'oggetto nave inizializzando in base alle variabile `len` (dimensione nave), `posizione1` (inizio della nave), `orientamento` i seguenti paramatri di classe:
- int `colpiRimanenti`: indica il numero di colpi mancanti per affondare la nave.
- String[ ] `coord`: array contenente le coordinate della nave in stringa (es. "A-3").
- boolean[ ] `colpi`: array booleano che indica in **true** gli indici delle coordinate colpite.

Al suo interno abbiamo il metodo `attacco` che prende in input la stringa della coordinata d'attacco, e restituisce in output lo stato dell'attaco:
- 0 = non colpito; (default)
- 1 = colpito;
- 2 = affondato;

Per fare ciò esegue un controllo tramite ciclo for su tutte le stringhe contenute in `coord`, comparando queste a **inputAttack**. Ogni volta che la nave viene colpita, lo stato passa a 1 (colpito) e `colpiRimanenti` decrementa. Quando il suo valore arriva a 0 lo stato della nave passa a 2 (affondata).

## Classe Board

Metodi principali:
- `posizionaNave`: posizionare le navi all'interno della griglia. Prende in input la lunghezza della nave, la prima coordinata e l'orientamento e in base a tali parametri prima controlla con il metodo `inBoard` se la nave sta entro i limiti della griglia, dopo tramite il metodo `aggiungiNave` controlla se si sovrappone alle navi già presenti, e in caso negativo crea un nuovo oggetto nave sfruttando la classe **Nave**. Se la nave è stata posizionata restituisce **true** come result.
- `attaccoCoordinata`: prende in input le coordinate d'attacco e richiamando il metodo `Nave.attacco`, in base al risultato restituito stampa a video il colpo è andato a segno o meno, e in caso affermativo se la nave è stata affondata o meno.
- `stampa board`: prende in input la board dell'utente e la stampa.
- `stampaAttacchi`: prende in input la board del computer e stampa la posizione degli attacchi già messi a segno su questo.

Nota: il metodo `PosizionaRandom` in base al numero di navi da inserire crea una prima coordinata randomica da inserire all'interno di `posizionaNave`. (realizzato per posizionare randomicamente le navi del computer)

## Classe BattagliaNavale

Questa classe costituisce il main del programma.
Al suo interno vengono creati gli oggetti **boardUtente** e **boardComputer**, ossia le griglie con all'interno le navi. Queste vengono inizializzate rispettivamente come:
- **boardComputer**: tramite il metodo `Board.PosizionaRandom`;
- **boardUtente**: tramite il metodo `inserimentoUtente`, che richiede all'utente l'input delle coordinate delle navi, e il loro orientamento (dando come predefinita la loro lunghezza in base all'array tipi). Utilizza il metodo `Board.PosizionaNave` per posizionare la nave.




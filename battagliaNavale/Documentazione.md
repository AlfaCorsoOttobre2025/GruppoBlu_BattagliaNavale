# Battaglia navale


## Classe Nave

La classe nave crea un'oggetto nave inizializzando in base alle variabile `len` (dimensione nave), `posizione1` (inizio della nave), `orientamento` i seguenti paramatri di classe:
- int `colpiRimanenti`: indica il numero di colpi mancanti per affondare la nave.
- String[ ] `coord`: array contenente le coordinate della nave in stringa (es. "A-3").
- boolean[ ] `colpi`: array booleano che indica in **true** gli indici delle coordinate colpite.

Al suo interno abbiamo il metodo `public static int attacco` che prende in input la stringa della coordinata d'attacco, e restituisce in output lo stato dell'attaco:
- 0 = non colpito; (default)
- 1 = colpito;
- 2 = affondato;

Per fare ciò esegue un controllo tramite ciclo for su tutte le stringhe contenute in `coord`, comparando queste a **inputAttack**. Ogni volta che la nave viene colpita, lo stato passa a 1 (colpito) e `colpiRimanenti` decrementa. Quando il suo valore arriva a 0 lo stato della nave passa a 2 (affondata).
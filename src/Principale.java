import java.util.Scanner;

public class Principale {
	public static int contaAuto=0;//Variabile globale che conta le auto e funge da contatore per i metodi setX
	public static 	Auto veicolo[]=new Auto[100];

public static void instanziatutto(){
	for (int i=0;i<100;i++){
		veicolo[i]=new Auto();//Creazione della singola istanza
	}
}
public static void uno (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	boolean errore=false;
	do{
		try{
		do{
			System.out.println("Inserire la targa di questa nuova auto:");
		}while(!veicolo[contaAuto].setTarga(leggi.next()));//set con controllo dell input
		System.out.println("Inserire la marca di questa nuova auto:");
		veicolo[contaAuto].setMarca(leggi.next());//setMarca con lettura
		System.out.println("Inserire il modello di questa nuova auto:");
		veicolo[contaAuto].setModello(leggi.next());//set con lettura
		System.out.println("Inserire il colore di questa nuova auto:");
		veicolo[contaAuto].setColore(leggi.next());//set con lettura
		System.out.println("Inserire le condizioni del motore di questa nuova auto:");
		veicolo[contaAuto].setCondizioniMotore(leggi.next());//setMarca con lettura
		do{
			System.out.println("Inserire la cilindrata di questa nuova auto:");
		}while(!veicolo[contaAuto].setCilindrata(leggi.nextInt()));//set con controllo dell input
		do{
			System.out.println("Inserire la capacita del serbatoio di questa nuova auto:");
		}while(!veicolo[contaAuto].setCapserb(leggi.nextFloat()));//set con controllo dell input
		do{
			System.out.println("Inserire il carburante presente in questa nuova auto:");
		}while(!veicolo[contaAuto].setCarbserb(leggi.nextFloat()));//set con controllo dell input
		do{
			System.out.println("Inserire la velocita massima di questa nuova auto:");
		}while(!veicolo[contaAuto].setVelMax(leggi.nextInt()));//set con controllo dell input
		do{
			System.out.println("Inserire i chilometri percorsi in questa nuova auto:");
		}while(!veicolo[contaAuto].setKmPercorsi(leggi.nextFloat()));//set con controllo dell input
		
		do{
			System.out.println("Inserire il prezzo di acquisto di questa nuova auto:");
		}while(!veicolo[contaAuto].setPrezzoAcquisto(leggi.nextDouble()));//set con controllo dell input
		
		
		System.out.println("La nuova auto e' stata inserita con successo!");
		System.out.println();
		contaAuto=contaAuto+1;
		}
		catch(Exception k){
			System.out.println("Si e' verificato un errrore, re inserisci la auto.");
			 errore=true;
			 contaAuto--;
		}
	}while (errore);
}
public static void due (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
	String findtarga;
	System.out.println("Inserisci la targa da cercare:");
	findtarga=leggi.next().toUpperCase();
	for(int i=0;i<contaAuto;i++){
		if(veicolo[i].getTarga().equals(findtarga))
		{
			System.out.println("E' stata trovata una auto con la targa "+findtarga+".");
			System.out.println("Marca:"+veicolo[i].getMarca());
			System.out.println("Modello:"+veicolo[i].getModello());
			System.out.println("Colore:"+veicolo[i].getColore());
			System.out.println("Cilindrata:"+veicolo[i].getCilindrata());
			System.out.println("Velocita' massima:"+veicolo[i].getVelMax());
			System.out.println("Capacita' serbatoio:"+veicolo[i].getCapserb());
			System.out.println("Condizioni Motore:"+veicolo[i].getCondizioniMotore());
			System.out.println("Carburante nel serbatoio:"+veicolo[i].getCarbserb());
			System.out.println("Km percorsi:"+veicolo[i].getKmPercorsi());
			System.out.println("Prezzo di acquisto:"+veicolo[i].getPrezzoAcquisto());
			
			if(veicolo[i].getPrezzoVendita()!=0){
				System.out.println("Prezzo di vendita:"+veicolo[i].getPrezzoVendita());
			}
		}
		else if(i==contaAuto)
		{
			System.out.println("La targa inserita non e' in archivio.");
		}
		System.out.println();
	}
		
		
	}
public static void tre (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void quattro (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void cinque (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void sei (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void sette (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void otto (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}
public static void nove (){
	Scanner leggi = new Scanner(System.in);//Scanner 
	leggi.useDelimiter("\n\r");
	
}

	public static void main(String[] args) {
		Scanner leggi = new Scanner(System.in);//Scanner 
		leggi.useDelimiter("\n\r");
		int scelta=0;
		instanziatutto();
		do{
			
			switch (scelta)
			{
			case 0:
				break;
			case 1:
				uno();
				break;
			case 2:
				due();
				break;
			case 3:
				tre();
				break;
			case 4:
				quattro();
				break;
			case 5:
				cinque();
				break;
			case 6:
				sei();
				break;
			case 7:
				sette();
				break;
			case 8:
				otto();
				break;
			case 9:
				nove();
				break;

			}
			
			do{
			System.out.println("Benvenuto nel programma per la gestione delle auto AutoX!");
			System.out.println("1.Inserimento Auto");
			System.out.println("2.Visualizza scheda auto in base alla targa");
			System.out.println("3.Calcolo del valore totale delle auto presenti in concessionario");
			System.out.println("4.Visualizza auto in base alla marca");
			System.out.println("5.Visualizza auto in base alla fascia di prezzo");
			System.out.println("6.Calcolo del numero totale delle auto");
			System.out.println("7.Calcolo del totale degli incassi per fascia di tempo");
			System.out.println("8.Test Drive");
			System.out.println("9.Vendi auto");
			System.out.println("10.Termine del programma");
			System.out.println("Prego scegliere l' operazione da eseguire:");
			scelta=leggi.nextInt();
			}while(scelta<0&&scelta>10);
			
		}while(scelta!=10);
		
		System.out.print("Arrivederci!");
		
	}

}
/*MANCANTI DA REALIZZARE
RIVEDERE PREZZO ACQUISTO O VENDITA
DATE!!
ALTRI COSI


*/
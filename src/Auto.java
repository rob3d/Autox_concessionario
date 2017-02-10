
public class Auto {
	private String targa;
	public String getTarga(){
		return targa;
	}
	public boolean setTarga(String s){
		boolean valida=false; 
		if(s.length()==7)
		{
			targa=s.toUpperCase();
			valida=true;
		}
		return valida;//Restituisce false se la targa non è valida e true se è valida
	}
	
	private String marca;
	public String getMarca(){
		return marca;
	}
	public void setMarca(String m){
		marca=m;
	}
	private String modello;
	public String getModello(){
		return modello;
	}
	public void setModello(String m){
		modello=m;
	}
	private String condizioniMotore;
	public String getCondizioniMotore(){
		return condizioniMotore;
	}
	public void setCondizioniMotore(String m){
		condizioniMotore=m;
	}
	private String colore;
	public String getColore(){
		return colore;
	}
	public void setColore(String m){
		colore=m;
	}
	private int cilindrata;
	public int getCilindrata(){
		return cilindrata;
	}
	public boolean setCilindrata(int c){
		boolean valida=false; 
		if(c<5000&&c>499)
		{
			cilindrata=c;
			valida=true;
		}
		return valida;//Restituisce false se la cilindrata non è valida e true se è valida
	}
	private float capserb;
	public float getCapserb(){
		return capserb;
	}
	public boolean setCapserb(float c){
		boolean valida=false; 
		if(c<100&&c>0)
		{
			capserb=c;
			valida=true;
		}
		return valida;//Restituisce false se la capacità del serbatoio non è valida e true se è valida
	}
	private float carbserb;
	public float getCarbserb(){
		return carbserb;
	}
	public boolean setCarbserb(float c){
		boolean valida=false; 
		if(c>=0&&c<capserb)
		{
			carbserb=c;
			valida=true;
		}
		return valida;//Restituisce false se il contenuto del serbatoio non è valida e true se è valida
	}
	private float velMax;
	public float getVelMax(){
		return velMax;
	}
	public boolean setVelMax(int v){
		boolean valida=false; 
		if(v<400&&v>0)
		{
			velMax=v;
			valida=true;
		}
		return valida;//Restituisce false se la velocità non è valida e true se è valida
	}
	
	private float velAttu;
	public float getVelAttu(){
		return velAttu;
	}
	private float kmpercorsi;
	public boolean setKmPercorsi(float k){
		boolean valida=false;
		if(k>=0&&k<=5000000){
		kmpercorsi=k;
		valida=true;
		}
		return valida;//Restituisce false se la velocità non è valida e true se è valida
	}
	public float getKmPercorsi(){
		return kmpercorsi;
	}
	private double prezzoAcquisto;
	public double getPrezzoAcquisto(){
		return prezzoAcquisto;
	}
	public boolean setPrezzoAcquisto(double k){
		boolean valida=false;
		if(k>=0){
		prezzoAcquisto=k;
		valida=true;
		}
		return valida;//Restituisce false se la velocità non è valida e true se è valida
	}
	private double prezzoVendita;
	public double getPrezzoVendita(){
		return prezzoVendita;
	}
	public boolean setPrezzoVendita(double k){
		boolean valida=false;
		if(k>=0){
		prezzoVendita=k;
		valida=true;
		}
		return valida;//Restituisce false se la velocità non è valida e true se è valida
	}
	
}

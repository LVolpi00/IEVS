
public class Elettore {
	private String nome;
	private String cognome;
	private String cdi;
	private String data_di_nascita;
	private String tessera_elettorale;
	
	//REQUIRES: Tutti gli argomenti != null
	//EFFECTS: Costruisce un nuovo oggetto Elettore con attributi uguali agli argomenti
	public Elettore(String n, String c,String d,String ddn,String t) {
		nome=n;
		cognome=c;
		cdi=d;
		data_di_nascita=ddn;
		tessera_elettorale=t;
	}
	
	//EFFECTS: Restituisce il numero di carta d'identità
	public String getCdi() {
		return cdi;
	}
	
	//EFFECTS: Restituisce il cognome
	public String getCognome() {
		return cognome;
	}
	
	//EFFECTS: Restituisce la data di nascita
	public String getData_di_nascita() {
		return data_di_nascita;
	}
	
	//EFFECTS: Restituisce il nome
	public String getNome() {
		return nome;
	}
	
	//EFFECTS: Restituisce il numero di tessera elettorale
	public String getTessera_elettorale() {
		return tessera_elettorale;
	}
	
	//EFFECTS: Imposta il numero di tessera elettorale
	//MODIFIES: Modifica il numero di tessera elettorale
	public void setCdi(String cdi) {
		this.cdi = cdi;
	}
	
	//EFFECTS: Imposta il cognome
	//MODIFIES: Modifica il cognome
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//EFFECTS: Imposta la data di nascita
	//MODIFIES: Modifica la data di nascita
	public void setData_di_nascita(String data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}
	
	//EFFECTS: Imposta il nome
	//MODIFIES: Modifica il nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//MODIFIES: Modifica il numero di tessera elettorale
	public void setTessera_elettorale(String tessera_elettorale) {
		this.tessera_elettorale = tessera_elettorale;
	}
}

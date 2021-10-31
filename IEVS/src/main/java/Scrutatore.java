
public class Scrutatore {
	private String nome;
	private String cognome;
	private String matricola;
	private String cdi;
	
	//REQUIRES: Tutti gli argomenti != null
	//EFFECTS: Costruisce un nuovo oggetto Scrutatore con attributi uguali agli argomenti
	public Scrutatore(String n,String c,String m, String d) {	
		nome=n;
		cognome=c;
		matricola=m;
		cdi=d;
	}
	
	//EFFECTS: Restituisce il numero di carta d'identità
	public String getCdi() {
		return cdi;
	}

	//EFFECTS: Restituisce il nome
	public String getNome() {
		return nome;
	}

	//EFFECTS: Restituisce il nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	//EFFECTS: Restituisce il cognome
	public String getCognome() {
		return cognome;
	}

	//EFFECTS: Imposta il cognome
	//MODIFIES: Modifica il cognome
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	//EFFECTS: Restituisce la matricola
	public String getMatricola() {
		return matricola;
	}

	//EFFECTS: Imposta la matricola
	//MODIFIES: Modifica la matricola
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	//EFFECTS: Imposta il numero di carta d'identità
	//MODIFIES: Modifica il numero di carta d'identità
	public void setCdi(String cdi) {
		this.cdi = cdi;
	}
	
	
}

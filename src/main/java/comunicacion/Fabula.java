package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	// constructor
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	// gets y sets 
	
	public String getEnsenanza() {
		return(ensenanza);
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return(interpretacion);
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	/// metodos
	
	public int palabrasTotales(int palpag) {
		int tot = palpag * this.getPaginas();
		return(tot);
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return(this.resumen() + "\n" + this.ensenanza);
	}
	
	
}
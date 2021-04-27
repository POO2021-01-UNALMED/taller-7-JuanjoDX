package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	// constructor 
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	/// gets y sets 
	public String[] getLetras() {
		return(letras);
	}
	public void setTitulo(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return(interpretacion);
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	/// metodos 

	public int cantidadLetras() {
		return(this.letras.length);
	}
	
	public String interpretacion() {
		return(this.interpretacion);
	}
	
	public String toString() {
		String aux = "";
		int aux1 = 0;
		while (aux1 < letras.length) {
			if (aux1 != (letras.length - 1)) {
				aux = aux + letras[aux1] + ", ";
				aux1++;
			}
			else {
				aux =aux + letras[aux1];
				aux1++;
			}
		}
		return(aux);
	}
}
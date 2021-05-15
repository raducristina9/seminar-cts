package ro.ase.cts.memento;
//atributele pe care vrem sa le salvam
public class Memento {
	
	private int numarSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	
	public Memento(int numarSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
		super();
		this.numarSpectatori = numarSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	public int getNumarSpectatori() {
		return numarSpectatori;
	}

	public void setNumarSpectatori(int numarSpectatori) {
		this.numarSpectatori = numarSpectatori;
	}

	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}

	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}

	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}

	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	
	
	
}

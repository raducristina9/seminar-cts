package ro.ase.cts.memento;

public class OriginatorMeci {
	
	private int numarSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int numarJandarmi;
	private int numarBileteVandute;
	
	public OriginatorMeci(int numarSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int numarJandarmi,
			int numarBileteVandute) {
		super();
		this.numarSpectatori = numarSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.numarJandarmi = numarJandarmi;
		this.numarBileteVandute = numarBileteVandute;
	}
	
	//daca facem constructor cu parametrii nu mai avem nevoie de set in memento
	
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

	public int getNumarJandarmi() {
		return numarJandarmi;
	}

	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}

	public int getNumarBileteVandute() {
		return numarBileteVandute;
	}

	public void setNumarBileteVandute(int numarBileteVandute) {
		this.numarBileteVandute = numarBileteVandute;
	}

	public Memento creareMemento() {
		return new Memento(numarSpectatori, numeEchipaGazda, numeEchipaOaspeti);
	}
	
	public void setMemento(Memento memento) {
		this.numarSpectatori=memento.getNumarSpectatori();
		this.numeEchipaGazda=memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti=memento.getNumeEchipaOaspeti();
				
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OriginatorMeci [numarSpectatori=");
		builder.append(numarSpectatori);
		builder.append(", numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", numarJandarmi=");
		builder.append(numarJandarmi);
		builder.append(", numarBileteVandute=");
		builder.append(numarBileteVandute);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}

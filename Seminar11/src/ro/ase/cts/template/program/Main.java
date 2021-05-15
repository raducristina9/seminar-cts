package ro.ase.cts.template.program;

import ro.ase.cts.template.Spectator;
import ro.ase.cts.template.SpectatorVIP;
import ro.ase.cts.template.TemplateSpectatorAbstract;

public class Main {

	public static void main(String[] args) {
	
		TemplateSpectatorAbstract spectatorAbstract=new Spectator("Cristina");
		TemplateSpectatorAbstract spectatorVip=new SpectatorVIP( "Loja 1","Alexandra");
		
		spectatorAbstract.intrarePeStadion(); 
		spectatorVip.intrarePeStadion();
		
		
		
	}

}

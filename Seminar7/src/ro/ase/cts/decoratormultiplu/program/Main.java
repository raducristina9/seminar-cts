package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.Bilet;
import ro.ase.cts.decoratormultiplu.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.DecoratorUrarePasteFericit;
import ro.ase.cts.decoratormultiplu.DecoratorulAbstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Bilet bilet=new Bilet("Steaua","Rapid");
		bilet.rezervaBilet();
		
		DecoratorulAbstract medciInGhencea=new DecoratorSustinereEchipa(bilet);
		medciInGhencea.rezervaBilet();
		
		DecoratorulAbstract meciDePaste=new DecoratorUrarePasteFericit(bilet);
		meciDePaste.rezervaBilet();
		
		DecoratorulAbstract meciInGhenceaDePaste=new DecoratorSustinereEchipa(meciDePaste);
		System.out.println();
		meciInGhenceaDePaste.rezervaBilet();
		
	}

}

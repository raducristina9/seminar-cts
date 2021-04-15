package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorAbstract;
import ro.ase.cts.decorator.DecoratorContactless;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card=new Card("Cristina", "12345");
		
		card.platesteOnline();
		card.platestePOS();
		
		DecoratorAbstract decoratorAbstract=new DecoratorContactless(card);
		decoratorAbstract.platesteContactless();
		decoratorAbstract.platesteOnline();
		decoratorAbstract.platestePOS();
		
		DecoratorAbstract decoratorAbstract2=new DecoratorContactlessTelefon(card);
		decoratorAbstract2.platesteContactless();
		
		//DecoratorAbstract decoratorAbstract3=new DecoratorContactless(decoratorAbstract2);
	
	}

}

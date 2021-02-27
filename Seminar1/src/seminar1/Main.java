package seminar1;

import clase.Animal;
import clase.Lion;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo zoo=new Zoo();
		Animal lion1=new Lion("Leu1");
		Lion lion2=new Lion("Leu2");
		zoo.addAnimal(lion1);	
		zoo.addAnimal(lion2);
		zoo.feedAllAnimals();


	}

}

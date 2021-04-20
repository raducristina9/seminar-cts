package ro.ase.cts.strategy;

public class PlataCard implements IModPlata{

	@Override
	public void plateste(int suma) {
		System.out.println("A fost platita cu cardul suma de "+suma + " lei");
		
	}

}

package ro.ase.cts.strategy;

public class PlataCash implements IModPlata{

	@Override
	public void plateste(int suma) {
		
		System.out.println("A fost platita cash suma de "+suma + " lei");
		
	}
}

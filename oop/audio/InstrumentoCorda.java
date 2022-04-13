package audio;

public class InstrumentoCorda implements Instrumento {
	public void afinar() {
		System.out.println("InstrumentoCorda.afinar()");
	}
	public void afinar(Tom tom) {
		System.out.println("InstrumentoCorda.afinar(Tom)");
	}
	public void tocar() {
		System.out.println("InstrumentoCorda.tocar()");
	}
}

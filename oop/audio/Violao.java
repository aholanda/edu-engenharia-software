package audio;

public class Violao extends InstrumentoCorda implements Instrumento {

    public void afinar() {
	System.out.println("Violao.afinar()");
    }
    public void tocar() {
	System.out.println("Violao.tocar()");
    }
}

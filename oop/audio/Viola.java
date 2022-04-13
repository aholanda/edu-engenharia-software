package audio;

public class Viola extends InstrumentoCorda implements Instrumento {

    public void afinar() {
	System.out.println("Viola.afinar()");
    }
    public void tocar() {
	System.out.println("Viola.tocar()");
    }
}

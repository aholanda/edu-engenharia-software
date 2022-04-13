package audio;

public class Guitarra extends InstrumentoCorda implements Instrumento {

    public void afinar() {
	System.out.println("Guitarra.afinar()");
    }
    public void tocar() {
	System.out.println("Guitarra.tocar()");
    }
}

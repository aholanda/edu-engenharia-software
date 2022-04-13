package audio;

public class Main {
    public static void main(String[] args) {
	    Bateria bateria;
	    Piano piano;
	    InstrumentoCorda corda;
	    InstrumentoSopro sopro;
	    
	    bateria = new Bateria();
	    bateria.tocar();

	    piano = new Piano();
	    piano.tocar();
	
	    System.out.println("\nAcoplamento dinâmico: InstrumentoSopro\n");
	    for (int i = 0; i < 5; i++) {
		    switch( (int)(Math.random() * 2) ) {
		    default: sopro = new InstrumentoSopro();
			    break;
		    case 0: sopro = new Flauta();
			    break;
		    case 1: sopro = new Saxofone();
			    break;
		    }
		    sopro.tocar();
	    }	    

	    System.out.println("\nAcoplamento dinâmico: InstrumentoCorda");
	    for (int i = 0; i < 5; i++) {
		    int sorteio = (int)(Math.random() * 3);
		    
		    switch(sorteio) {
		    default: corda = new InstrumentoCorda();
			    break;
		    case 0: corda = new Guitarra();
			    break;
		    case 1: corda = new Viola();
			    break;
		    case 2: corda = new Violao();
			    break;
		    }
		    corda.afinar(new Tom());
		    corda.tocar();
		    
	    }	    
    }
}

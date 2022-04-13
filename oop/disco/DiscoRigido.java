package disco;

public class DiscoRigido implements ICusto {
	private static int custo;

	private Cabecote cabecote;
	private EixoDisco eixo;
	private Carcaca carcaca;
	private Motor motor;

	private Bandeja bandejas[] = new Bandeja[4];
    
	public DiscoRigido() {
		cabecote = new Cabecote();
		eixo = new EixoDisco();
		carcaca = new Carcaca();
	
		for (int i = 0; i < bandejas.length; i++)
			bandejas[i] = new Bandeja();

		motor = new Motor();
	}
    
	public int calculaCusto() {

		custo = eixo.calculaCusto() + carcaca.calculaCusto()
			+ cabecote.calculaCusto() + motor.calculaCusto();
		
		for (int i = 0; i < bandejas.length; i++)
			custo += bandejas[i].calculaCusto();
	
		return custo;
	}
}

package disco;

public class Motor implements ICusto {
	private static int custo;

	private Solenoide solenoide;
	private Rolamento rolamento;
	private Base base;
	private EixoMotor eixo;

	private Cabo cabos[] = new Cabo[4];

	public Motor() {
		solenoide = new Solenoide();
		base = new Base();
		rolamento = new Rolamento();
		eixo = new EixoMotor();
	
		for (int i = 0; i < cabos.length; i++)
			cabos[i] = new Cabo();
	}
    
	public int calculaCusto() {

		custo = solenoide.calculaCusto() + base.calculaCusto()
			+ rolamento.calculaCusto() + eixo.calculaCusto();

		for (int i = 0; i < cabos.length; i++)
			custo += cabos[i].calculaCusto();
	
		return custo;
	}
}

import java.util.List;
public class SubtipoCuringa {
	static double somar(List<? extends Number> lista) {
		double soma = 0.0;
		for (Number n: lista)
			soma += n.doubleValue();
		return soma;
	}}
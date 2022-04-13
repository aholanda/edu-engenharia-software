import java.util.List;
import java.util.ArrayList;
public class SubtipoCuringaExec {
	public static void main(String[] args) {
		double res;
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(4);
		res = SubtipoCuringa.somar(lista);
		System.out.println("A soma e igual a "+res);
	}}
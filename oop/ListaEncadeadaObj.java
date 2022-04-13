class No {
	Object val; // valor
	No prox; // proximo no
	No(Object val, No prox) {
		this.val = val;
		this.prox = prox;
	}}
public class ListaEncadeadaObj {
	public No prim; // primeiro no
	private No ult; // ultimo no
	public void inserir(Object val) {
		if(prim == null) {
			ult = new No(null, null);
			prim = new No(val, null);
		} else {
			No tmp = new No(val, null);
			if(prim.prox == null)
				prim.prox = tmp;
			else
				ult.prox = tmp;
			ult = tmp;
		}}}


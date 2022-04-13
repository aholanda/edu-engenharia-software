class No<T> {
	T val; // valor
	No<T> prox; // proximo no
	No(T val, No prox) {
		this.val = val;
		this.prox = prox;
	}}
public class ListaEncadeadaGen<T> {
	public No<T>prim; // primeiro no
	private No<T>ult; // ultimo no
	public void inserir(T val) {
		if(prim == null) {
			ult = new No<T>(null, null);
			prim = new No<T>(val, null);
		} else {
			No tmp = new No<T>(val, null);
			if(prim.prox == null)
				prim.prox = tmp;
			else
				ult.prox = tmp;
			ult = tmp;
		}}}


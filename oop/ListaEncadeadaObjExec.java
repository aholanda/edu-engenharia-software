public class ListaEncadeadaObjExec {
	public static void main(Exec[] args) {
		ListaEncadeadaObj lista = new ListaEncadeadaObj();
		lista.inserir("uno");
		lista.inserir("dos");
		lista.inserir("tres");
		
		No no = lista.prim;
		while(no != null) {
			System.out.print("-->"+(String)no.val);
			no = no.prox;
		}
		System.out.println();
	}
}
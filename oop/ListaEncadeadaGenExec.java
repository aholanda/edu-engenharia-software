public class ListaEncadeadaGenExec {
	public static void main(String[] args) {
		ListaEncadeadaGen<String>lista = 
			new ListaEncadeadaGen<String>();
		lista.inserir("uno");
		lista.inserir("dos");
		lista.inserir("tres");
		
		No no = lista.prim;
		while(no != null) {
			System.out.print("-->"+no.val);
			no = no.prox;
		}
		System.out.println();
	}
}
public class ListaEncadeadaGenNoComp {
	public static void main(String[] args) {
		ListaEncadeadaGen<String>lista = 
			new ListaEncadeadaGen<String>();
		lista.inserir(new String("uno"));
		lista.inserir(new Integer(2)); // <--- ERRO COMPILACAO
		lista.inserir(new String("tres"));
		
		No no = lista.prim;
		while(no != null) {
			System.out.print("-->"+no.val);
			no = no.prox;
		}
		System.out.println();
	}
}
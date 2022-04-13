public class ListaEncadeadaObjNoExec {
	public static void main(String[] args) {
		ListaEncadeadaObj lista = new ListaEncadeadaObj();
		lista.inserir(new String("uno"));
		lista.inserir(new Integer(2)); // <-- ERRO EXECUCAO
		lista.inserir(new String("tres"));
		
		No no = lista.prim;
		while(no != null) {
			System.out.print("-->"+(String)no.val);
			no = no.prox;
		}
		System.out.println();
	}
}
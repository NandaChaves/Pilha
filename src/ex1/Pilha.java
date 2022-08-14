package ex1;

public class Pilha {

	private ListaLigada lista;
	public Pilha() {
		this.lista= new ListaLigada();
	}

	public void adicionar(String novoValor)
	{
		this.lista.adicionarComeco(novoValor);
	}
	
	public void remover()
	{
		this.lista.remover(get());
	}
	
	public String get()
	{
		return this.lista.getPrimeiro().getValor();
	}
}

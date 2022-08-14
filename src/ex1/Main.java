package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pilha pilha = new Pilha();
     
     pilha.adicionar("E");
     pilha.adicionar("B");
     pilha.adicionar("Z");
     pilha.adicionar("D");
     pilha.adicionar("C");
     /**C
      * D
      * Z
      * B
      * E*/
     System.out.println("Topo:" + pilha.get());
     
     pilha.remover();
     
     System.out.println("Novo topo:" + pilha.get());
     
     //pilha.remover();
     
     //System.out.println("Novo topo:" + pilha.get());
     
     
	}

}

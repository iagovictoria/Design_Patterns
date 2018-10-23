package Exec_2_2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Marcador num = new Numero();
		Lista lista = new Ordenada(num);
		
		lista.adicionar("Z");
		lista.adicionar("C");
		lista.adicionar("H");
		lista.adicionar("R");
		lista.adicionar("A");
		
		lista.imprimir();
		
		System.out.println("--------------");
		
		Marcador ast = new Asterisco();
		Lista lista2 = new NaoOrdenada(ast);
		
		lista2.adicionar("Z");
		lista2.adicionar("C");
		lista2.adicionar("H");
		lista2.adicionar("R");
		lista2.adicionar("A");
		
		lista2.imprimir();
		
	}

}

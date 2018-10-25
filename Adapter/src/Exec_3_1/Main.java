package Exec_3_1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SArquivos pasta = new Pasta("Linguagens");
		SArquivos pasta1 = new Pasta("Java");
		SArquivos pasta2 = new Pasta("C");
		SArquivos pasta3 = new Pasta("Python");
		
		SArquivos arq1 = new Arquivo("Decorator.java","10");
		SArquivos arq2 = new Arquivo("Decorator.c","20");
		SArquivos arq3 = new Arquivo("Decorator.pyd","30");
		
		pasta.add(pasta1);
		pasta.add(pasta2);
		pasta.add(pasta3);
		
		pasta1.add(arq1);
		pasta2.add(arq2);
		pasta3.add(arq3);
		
		pasta.imprimeItem();
		
		System.out.println("----------------");
		
		pasta1.imprimeItem();
	}

}

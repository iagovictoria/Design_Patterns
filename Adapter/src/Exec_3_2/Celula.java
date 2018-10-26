package Exec_3_2;

public class Celula extends ExcelAbs{

	private String conteudo;

	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}

	public void imprimir() {
		// Limita o conteúdo a exatamente 15 caracteres.
		if(conteudo.length() >= 15) {
		conteudo = conteudo + " ";
		conteudo = conteudo.substring(0, 15);
		System.out.print(" | " + conteudo);
		} else {		
			System.out.print(" | " + conteudo);			
		}
		
		
	}
	
	public String getConteudo() {
		return conteudo;
	}

}

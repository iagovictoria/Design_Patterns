package Exec_3_2;

public class Celula extends ExcelAbs{

	private String conteudos;

	public Celula(String conteudos) {
		this.conteudos = conteudos;
	}

	public void imprimir() {
		String conteudo = getConteudo();
		// Limita o conte�do a exatamente 15 caracteres.
		if(conteudo.length() >= 15) {
		conteudo = conteudo + " ";
		conteudo = conteudo.substring(0, 15);
		System.out.print(" | " + conteudo);
		} else {		
			System.out.print(" | " + conteudo);			
		}
		
		
	}
	
	public String getConteudo() {
		return conteudos;
	}

}

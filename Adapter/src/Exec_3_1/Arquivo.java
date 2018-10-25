package Exec_3_1;

public class Arquivo extends SArquivos{
	private String nome;
	private String tamanhoKB;

	public Arquivo(String nome, String tamanhoKB) {
		this.nome = nome;
		this.tamanhoKB = tamanhoKB;
	}

	@Override
	public void imprimeItem() {
		System.out.println(nome);
		
	}

}

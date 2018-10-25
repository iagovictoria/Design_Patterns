package Exec_3_1;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends SArquivos {
	private String nome;
	private List<SArquivos> sis = new ArrayList<SArquivos>();

	public Pasta(String nome) {
		this.nome = nome;
	}

	@Override
	public void imprimeItem() {
		System.out.println(nome);
		for(SArquivos arq: sis) {
			arq.imprimeItem();
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void add(SArquivos a) {
		sis.add(a);
	}
	
	public void remove(SArquivos a) {
		sis.remove(a);
	}

}

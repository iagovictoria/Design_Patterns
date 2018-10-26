package Exec_3_2;

import java.util.ArrayList;
import java.util.List;

public class Tabela extends ExcelAbs{
	private String nome;
	private List<Linha> linhas = new ArrayList<Linha>();

	public Tabela(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println(nome);
		for(Linha l: linhas) {
			l.imprimir();
		}
	}
	
	public void adicionar(Linha e) {
		linhas.add(e);
	}
}

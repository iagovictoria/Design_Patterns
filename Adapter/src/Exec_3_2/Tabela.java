package Exec_3_2;

import java.util.ArrayList;
import java.util.List;

public class Tabela extends ExcelAbs{
	private String nome;
	private List<ExcelAbs> linhas = new ArrayList<ExcelAbs>();

	public Tabela(String nome) {
		this.nome = nome;
	}
	
	public void imprimir() {
		System.out.println(nome);
		for(ExcelAbs l: linhas) {
			
			l.imprimir();
			System.out.println("|");
			System.out.println("\n");
		}
	}
	
	public void adicionar(ExcelAbs e) {
		linhas.add(e);
	}
}

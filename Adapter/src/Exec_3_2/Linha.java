package Exec_3_2;

import java.util.ArrayList;
import java.util.List;

public class Linha extends ExcelAbs{

	private List<Celula> celulas = new ArrayList<Celula>();

	public void imprimir() {
		for(Celula c: celulas) {
			System.out.println(c.getConteudo());
		}		
	}

	public void adicionar(Celula cel) {
		celulas.add(cel);
	}

}

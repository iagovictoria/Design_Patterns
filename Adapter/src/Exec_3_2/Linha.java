package Exec_3_2;

import java.util.ArrayList;
import java.util.List;

public class Linha extends ExcelAbs{

	private List<ExcelAbs> celulas;
	
	public Linha() {
		celulas = new ArrayList<ExcelAbs>();
	}

	public void imprimir() {
		for(ExcelAbs c: celulas) {
			c.imprimir();
		}		
	}

	public void adicionar(ExcelAbs cel) {
		celulas.add(cel);
	}
	

}

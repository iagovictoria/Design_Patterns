package Exec_3_2;

import java.util.ArrayList;
import java.util.List;

public class Excel extends ExcelAbs{
	private List<ExcelAbs> excel = new ArrayList<ExcelAbs>();

	public Excel() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir() {
		for(ExcelAbs a: excel) {
			a.imprimir();
		}
	}
	
	public void adicionar(ExcelAbs e) {
		excel.add(e);		
	}
	
	public void remover(ExcelAbs e) {
		excel.remove(e);
	}
	
}

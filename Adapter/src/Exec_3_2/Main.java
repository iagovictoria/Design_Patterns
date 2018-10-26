package Exec_3_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ExcelAbs ex1 = new Excel();
		
		ExcelAbs tab1 = new Tabela("Futebol");
		ExcelAbs tab2 = new Tabela("Times");
		
		ExcelAbs lin1 = new Linha();
		ExcelAbs lin2 = new Linha();
		ExcelAbs lin3 = new Linha();
		
		ExcelAbs cel1 = new Celula("Grêmio");
		ExcelAbs cel2 = new Celula("River Plate");
		ExcelAbs cel3 = new Celula("Boca Juniors");
		ExcelAbs cel4 = new Celula("Flamengo");
		
		lin1.adicionar(cel1);
		lin2.adicionar(cel2);
		lin3.adicionar(cel3);
		lin3.adicionar(cel4);
		
		tab1.adicionar(lin1);
		tab1.adicionar(lin2);
		tab1.adicionar(lin3);
		
		//tab1.imprimir();
		
		//cel1.imprimir();
		lin1.imprimir();
		

	}

}

package Exec_2_2;

import java.util.ArrayList;
import java.util.List;

public class Numero implements Marcador{

	public Numero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> marcar(List<String> lista) {
		int cont = 1;
		List<String> numero = new ArrayList<String>();
		for(String a: lista) {
			numero.add(cont + " " + a);
			cont++;
		}
		return numero;
		
	}

}

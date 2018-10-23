package Exec_2_2;

import java.util.ArrayList;
import java.util.List;

public class Asterisco implements Marcador{

	public Asterisco() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> marcar(List<String> lista) {
		List<String> asterisco = new ArrayList<String>();
		for(String a: lista) {
			asterisco.add("* " + a);
		}
		return asterisco;
	}

}

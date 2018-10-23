package Exec_2_2;

import java.util.ArrayList;
import java.util.List;

public class NaoOrdenada extends Lista {
	private List<String> lista;

	public NaoOrdenada(Marcador m) {
		super(m);
		lista = new ArrayList<String>();
		}
		
		public void adicionar(String s) {
			lista.add(s);
		}
		
		public void imprimir() {
			List<String> listaM = m.marcar(lista);
			for(String a: listaM) {
			System.out.println(a + "\n");
			}
		}

}

package Exec_4_1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Componente c = new ComponenteConcreto();
		Componente c2 = new Interceptador(c);
		Componente c3 = new InterceptadorLog();
		Componente c4 = new InterceptadorPar();
		
		
		c3.executarTarefa();
		c4.executarTarefa();
		c2.executarTarefa();
		c.executarTarefa();

	}

}

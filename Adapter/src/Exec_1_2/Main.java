package Exec_1_2;

public class Main{

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SomadorEsperado s = new SomadorEsperadoConcreto();
		Cliente c = new Cliente(s);
		c.executar();
	}

}

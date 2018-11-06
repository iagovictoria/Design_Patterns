package Exec_4_1;

public class ComponenteConcreto implements Componente{

	public ComponenteConcreto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

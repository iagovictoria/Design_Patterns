package Exec_4_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterceptadorPar implements Componente{

	public InterceptadorPar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executarTarefa() {
		DateFormat dateFormat = new SimpleDateFormat("mm"); 
		DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss"); 
		Date date = new Date();
		int minutos = Integer.parseInt(dateFormat.format(date));
		if((minutos % 2) == 0) {
			System.out.println("Execução interrompida em minuto par: " + dateFormat2.format(date) );
			System.exit(0);
		}
		 
		
		
	}

}

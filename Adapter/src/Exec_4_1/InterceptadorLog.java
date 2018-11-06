package Exec_4_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterceptadorLog implements Componente{

	public InterceptadorLog() {

	}

	@Override
	public void executarTarefa() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date(); 
		 
		System.out.println(dateFormat.format(date) + ": " + "Data atual!");
		
	}

}

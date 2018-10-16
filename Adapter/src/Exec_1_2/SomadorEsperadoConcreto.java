package Exec_1_2;

public class SomadorEsperadoConcreto implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for (int i = 0; i < vetor.length ; i++)
			resultado += vetor[i];
		return resultado;
	}

}

package Exec_2_1;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ImplementacaoRefrigerante cocaP = new CocaCola();
		AbstracaoTamanho pc = new TamanhoPequeno(cocaP);
		pc.beber();
		
		ImplementacaoRefrigerante cocaM = new CocaCola();
		AbstracaoTamanho mc = new TamanhoMedio(cocaM);
		mc.beber();
		
		ImplementacaoRefrigerante guaranaP = new Guarana();
		AbstracaoTamanho pg = new TamanhoPequeno(guaranaP);
		pg.beber();
		
		ImplementacaoRefrigerante guaranaM = new Guarana();
		AbstracaoTamanho mg = new TamanhoMedio(guaranaM);
		mg.beber();
		
		ImplementacaoRefrigerante fantaG = new Fanta();
		AbstracaoTamanho gf = new TamanhoGrande(fantaG);
		gf.beber();
		
		ImplementacaoRefrigerante spriteG = new Sprite();
		AbstracaoTamanho sg = new TamanhoGrande(spriteG);
		sg.beber();

	}

}

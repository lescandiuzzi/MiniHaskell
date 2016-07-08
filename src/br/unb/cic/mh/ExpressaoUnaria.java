package br.unb.cic.mh;

public abstract class ExpressaoUnaria implements Expressao {

	protected Expressao sub;
	
	public ExpressaoUnaria(Expressao ss){
		this.sub = ss;
	}
	
	public Expressao getSub(){
		return sub;
	}
}

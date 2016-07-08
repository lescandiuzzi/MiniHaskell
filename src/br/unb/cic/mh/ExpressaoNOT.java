package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoNOT extends ExpressaoUnaria{

	public ExpressaoNOT (Expressao s1){
		super (s1);
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano b1 = (ValorBooleano)sub.avaliar();
		
		if (b1.getValor() == true){
			b1.setValor(false);
			return new ValorBooleano(b1.getValor());
		}
		
		else {
			b1.setValor(true);
			return new ValorBooleano(b1.getValor());
		}	
	}
	
	@Override
	public Tipo tipo() {
		Tipo t1 = sub.tipo();
		
		if(t1.equals(Tipo.BOOLEANO)) {
			return Tipo.BOOLEANO;
		}
		return Tipo.ERRO;
		
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.BOOLEANO);
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}

package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoAND extends ExpressaoBinaria{

	public ExpressaoAND (Expressao s1, Expressao s2){
		super (s1, s2);
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano b1 = (ValorBooleano)sub1.avaliar();
		ValorBooleano b2 = (ValorBooleano)sub2.avaliar();
		
		if (b1.getValor() == false && b2.getValor() == false){
			return new ValorBooleano(b1.getValor());
		}
		
		if (b1.getValor() == true && b2.getValor() == false){
			return new ValorBooleano(b2.getValor());
		}
		
		if (b1.getValor() == false && b2.getValor() == true){
			return new ValorBooleano(b1.getValor());
		}
		
		else {
			return new ValorBooleano(b2.getValor());
		}	
	}
	
	@Override
	public Tipo tipo() {
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		
		if(t1.equals(Tipo.BOOLEANO) && t2.equals(Tipo.BOOLEANO)) {
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

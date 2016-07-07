package br.unb.cic.mh.visitor;

import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoDiferente;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgual;
import br.unb.cic.mh.ExpressaoLet;
import br.unb.cic.mh.ExpressaoMaior;
import br.unb.cic.mh.ExpressaoMaiorIgual;
import br.unb.cic.mh.ExpressaoMenor;
import br.unb.cic.mh.ExpressaoMenorIgual;
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ExpressaoSubtracao;
import br.unb.cic.mh.ExpressaoMultiplicacao;
import br.unb.cic.mh.ExpressaoDivisao;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;
import br.unb.cic.mh.ValorLista;

public class Adaptador implements Visitor {

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
	}

	@Override
	public void visitar(ExpressaoLet exp) {
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
	}
	
	public void visitar (ExpressaoSubtracao exp){
	}
	
	public void visitar (ExpressaoMultiplicacao exp){
	}
	
	public void visitar (ExpressaoDivisao exp){
	}

	@Override
	public void visitar(ExpressaoRefId exp) {
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
	}

	@Override
	public void visitar(ValorInteiro exp) {
	}

	@Override
	public void visitar(ValorBooleano exp) {
	}

	@Override
	public void visitar(ExpressaoIgual exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoDiferente exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMenor exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaior exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMenorIgual exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaiorIgual exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ValorLista exp) {
		// TODO Auto-generated method stub
		
	}

}

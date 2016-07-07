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

public class PPVisitor implements Visitor {

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
		
	}

	@Override
	public void visitar(ExpressaoLet exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" + ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
	}

	@Override
	public void visitar (ExpressaoSubtracao exp){
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" - ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
	}
	
	public void visitar (ExpressaoMultiplicacao exp){
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" * ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
	}

	public void visitar (ExpressaoDivisao exp){
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" / ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
	}


	@Override
	public void visitar(ExpressaoRefId exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ValorInteiro exp) {
		System.out.println(exp.getValor());
	}

	@Override
	public void visitar(ValorBooleano exp) {
		if(exp.getValor()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	@Override
	public void visitar(ExpressaoIgual exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" == ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

	@Override
	public void visitar(ExpressaoDiferente exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" != ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

	@Override
	public void visitar(ExpressaoMenor exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" < ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

	@Override
	public void visitar(ExpressaoMaior exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" > ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

	@Override
	public void visitar(ExpressaoMenorIgual exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" <= ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

	@Override
	public void visitar(ExpressaoMaiorIgual exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" >= ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
		
	}

}

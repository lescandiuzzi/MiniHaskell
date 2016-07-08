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
import br.unb.cic.mh.ExpressaoOR;
import br.unb.cic.mh.ExpressaoAND;
import br.unb.cic.mh.ExpressaoNOT;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;
import br.unb.cic.mh.ValorLista;

public interface Visitor {
	public void visitar(ExpressaoIfThenElse exp);
	public void visitar(ExpressaoLet exp);
	public void visitar(ExpressaoSoma exp);
	public void visitar(ExpressaoSubtracao exp);
	public void visitar(ExpressaoMultiplicacao exp);
	public void visitar(ExpressaoDivisao exp);
	public void visitar(ExpressaoOR exp);
	public void visitar(ExpressaoAND exp);
	public void visitar(ExpressaoNOT exp);
	public void visitar(ExpressaoIgual exp);
	public void visitar(ExpressaoMaior exp);
	public void visitar(ExpressaoMaiorIgual exp);
	public void visitar(ExpressaoDiferente exp);
	public void visitar(ExpressaoMenor exp);
	public void visitar(ExpressaoMenorIgual exp);
	public void visitar(ExpressaoRefId exp);
	public void visitar(ExpressaoAplicacao exp);
	public void visitar(ValorInteiro exp);
	public void visitar(ValorBooleano exp);
	public void visitar(ValorLista exp);
}

package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ValorListaPopulada<T extends Valor> extends ValorLista<T> {
	
	public ValorListaPopulada(T valor) {
		super(valor);
	}
	
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
		
	}

	@Override
	public T getValor() {
		return this.getValorP();
	}

	@Override
	public ValorLista<T> inserir(T valor) {
		ValorLista<T> novo = new ValorListaPopulada<T>(valor);
		novo.setInicio(null);
		novo.setFim(this);
		this.setInicio(novo);
		return novo;
	}

	@Override
	public void remover() {
		if (this.getInicio() != null) {
			this.getInicio().setFim(this.getFim());
		}
		this.getFim().setInicio(this.getInicio());
		
	}

}

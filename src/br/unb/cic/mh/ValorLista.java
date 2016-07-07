package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public abstract class ValorLista<T extends Valor> implements Valor{
	
	private ValorLista<T> inicio;
	private ValorLista<T> fim;
	private T valor;
	
	
	public ValorLista(T valor){
		this.valor = valor;		
	}
	
	
	@Override
	public Tipo tipo() {
		
		return valor.tipo();
	}

	@Override
	public boolean checarTipo() {		
		return valor.checarTipo();
	}

	@Override
	public Valor avaliar() {		
		return valor.avaliar();
	}

	public abstract T getValor();
	public abstract ValorLista<T> inserir(T valor);	
	public abstract void remover();
	
	public T getValorP(){
		return this.valor;		
	}
	
	public void setValorP(T valor){
		this.valor = valor;
	}
	
	public ValorLista<T> getInicio(){
		return this.inicio;
	}
	
	public ValorLista<T> getFim(){
		return this.fim;
	}
	
	public void setInicio(ValorLista<T> inicio){
		this.inicio = inicio;
	}
	
	public void setFim(ValorLista<T> fim){
		this.fim = fim;		
	}
	public int size(){
		int tamanho = 0;
		
		ValorLista<?> aux = this;
		
		while(!(aux instanceof ValorListaVazia<?>)){
			tamanho++;
			aux = aux.getFim();
		}
		
		return tamanho;
	}

}

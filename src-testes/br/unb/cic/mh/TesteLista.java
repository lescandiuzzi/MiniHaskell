package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteLista {

	@Test
	public void test() {
		ValorLista<ValorInteiro> lista = new ValorListaVazia<ValorInteiro>();		
		ValorLista<ValorInteiro> list2 = lista.inserir(new ValorInteiro(3));
		
		ValorInteiro res = list2.getValor();
		assertEquals(new Integer(3), res.getValor());
		
		list2 = list2.inserir(new ValorInteiro(5));
		
		res = list2.getValor();
		assertEquals(new Integer(5), res.getValor());
		
		res = list2.getFim().getValor();
		assertEquals(new Integer(3), res.getValor());
		
		res = (ValorInteiro)list2.getFim().getFim().getValor();
		assertEquals(null, res);
	}

}

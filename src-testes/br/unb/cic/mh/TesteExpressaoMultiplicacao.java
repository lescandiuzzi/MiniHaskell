package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMultiplicacao {

	@Test
	public void testMultiplicacaoSimples (){
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v7 = new ValorInteiro(7);
		
		//testa 2*7
		ExpressaoMultiplicacao multiplica = new ExpressaoMultiplicacao (v2, v7);
		
		ValorInteiro res = (ValorInteiro)multiplica.avaliar();
		Assert.assertEquals (new Integer(14), res.getValor());
		
		//testa 7*2
		ExpressaoMultiplicacao multiplicaInvertido = new ExpressaoMultiplicacao (v7,v2);
		
		ValorInteiro resInvertido = (ValorInteiro)multiplicaInvertido.avaliar();
		Assert.assertEquals(new Integer(14), resInvertido.getValor()); 
	}
	
	@Test
	public void testMultiplicacaoComplexa() {
		ValorInteiro v3 = new ValorInteiro(3);
		ValorInteiro v4 = new ValorInteiro(4);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMultiplicacao multiplica1 = new ExpressaoMultiplicacao(v3, v4); //multiplica 3*4
		ExpressaoMultiplicacao multiplica2 = new ExpressaoMultiplicacao(multiplica1, v10); //multiplica (3*4)*10
		
		ValorInteiro res = (ValorInteiro)multiplica2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(120), res);
		
		
		ExpressaoMultiplicacao multiplica3 = new ExpressaoMultiplicacao(v3, v3);//multiplica 3*3
		
		ValorInteiro res3 = (ValorInteiro)multiplica3.avaliar();
		
		Assert.assertEquals(new ValorInteiro(9), res3);
	}
	
}

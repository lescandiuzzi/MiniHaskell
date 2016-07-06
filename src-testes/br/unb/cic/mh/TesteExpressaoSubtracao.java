package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoSubtracao {
	
	@Test
	public void testSubtracaoSimples() {
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v7 = new ValorInteiro(7);
		
		ExpressaoSubtracao subtracao = new ExpressaoSubtracao (v10,v7);
		ValorInteiro res = (ValorInteiro)subtracao.avaliar();
		Assert.assertEquals(new Integer(3), res.getValor());
	}
	
	@Test
	public void testSubtracaoComplexa() {
		ValorInteiro v20 = new ValorInteiro(20);
		ValorInteiro v5 = new ValorInteiro(5);
		ValorInteiro v4 = new ValorInteiro(4);
		
		ExpressaoSubtracao subtracao1 = new ExpressaoSubtracao (v20, v5);
		ExpressaoSubtracao subtracao2 = new ExpressaoSubtracao (subtracao1, v4);
		
		ValorInteiro res = (ValorInteiro)subtracao2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(11), res);
	}

}

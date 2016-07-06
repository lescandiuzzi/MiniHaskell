package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDivisao {
	
	@Test
	public void testDivisaoSimples() {
		ValorInteiro v15 = new ValorInteiro(15);
		ValorInteiro v5 = new ValorInteiro(5);
		
		ExpressaoDivisao divide = new ExpressaoDivisao(v15, v5);
		
		ValorInteiro res = (ValorInteiro)divide.avaliar();
		Assert.assertEquals(new Integer(3), res.getValor());
	}
	
	@Test
	public void testDivisaoComplexa(){
		ValorInteiro v24 = new ValorInteiro(24);
		ValorInteiro v3 = new ValorInteiro(3);
		ValorInteiro v2 = new ValorInteiro(2);
		
		ExpressaoDivisao divide1 = new ExpressaoDivisao(v24, v3); //divide: 24/3
		ExpressaoDivisao divide2 = new ExpressaoDivisao(divide1, v2); //divide: (24/3)/2
		
		ValorInteiro res = (ValorInteiro)divide2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(4), res);
	}

}

package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoIgual {
	
	@Test
	public void testIgualdade() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v52 = new ValorInteiro(5);
		
		ExpressaoIgual igualdade = new ExpressaoIgual(v5, v52);
		
		ValorBooleano res = (ValorBooleano)igualdade.avaliar();
		Assert.assertEquals(true, res.getValor());
	}

}

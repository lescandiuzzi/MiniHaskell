package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoOR {

	@Test
	public void testOr(){
		ValorBooleano b1 = new ValorBooleano(true);
		ValorBooleano b2 = new ValorBooleano(false);
		
		ExpressaoOR or = new ExpressaoOR(b1, b2);
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
}

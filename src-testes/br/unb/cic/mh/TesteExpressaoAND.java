package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoAND {

	@Test
	public void testAnd(){
		ValorBooleano b1 = new ValorBooleano(true);
		ValorBooleano b2 = new ValorBooleano(false);
		
		ExpressaoAND and = new ExpressaoAND(b1, b2);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}

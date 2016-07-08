package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoNOT {
	
	@Test
	public void testNot(){
		ValorBooleano b1 = new ValorBooleano(true);
		
		ExpressaoNOT not = new ExpressaoNOT(b1);
		
		ValorBooleano res = (ValorBooleano)not.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
}

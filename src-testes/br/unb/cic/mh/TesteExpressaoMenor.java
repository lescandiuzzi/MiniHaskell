package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMenor {

	@Test
	public void test() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		
		ExpressaoMenor menor = new ExpressaoMenor(v2, v5);
		
		ValorBooleano res = (ValorBooleano)menor.avaliar();
		Assert.assertEquals(true, res.getValor());
	}

}

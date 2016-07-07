package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaior {

	@Test
	public void test() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		
		ExpressaoMaior maior = new ExpressaoMaior(v5, v2);
		
		ValorBooleano res = (ValorBooleano)maior.avaliar();
		Assert.assertEquals(true, res.getValor());
	}

}

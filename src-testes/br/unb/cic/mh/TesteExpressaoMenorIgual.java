package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMenorIgual {

	@Test
	public void test() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v52 = new ValorInteiro(5);
		
		ExpressaoMenorIgual menorIgual = new ExpressaoMenorIgual(v52, v5);
		
		ValorBooleano res = (ValorBooleano)menorIgual.avaliar();
		Assert.assertEquals(true, res.getValor());
	}

}

package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaiorIgual {

	@Test
	public void test() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		ValorInteiro v52 = new ValorInteiro(5);
		
		ExpressaoMaiorIgual maiorIgual = new ExpressaoMaiorIgual(v5, v52);
		
		ValorBooleano res = (ValorBooleano)maiorIgual.avaliar();
		Assert.assertEquals(true, res.getValor());
	}

}

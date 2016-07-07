package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDiferente {

	@Test
	public void TesteDiferente() {
		
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v2 = new ValorInteiro(2);
		
		ExpressaoDiferente diferente = new ExpressaoDiferente(v5, v2);
		
		ValorBooleano res = (ValorBooleano)diferente.avaliar();
		
		Assert.assertEquals(true, res.getValor());
	}

}

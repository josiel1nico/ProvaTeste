package testsCartao;

import static org.junit.Assert.assertEquals;
import main.Cartao;
import org.junit.Test;

public class EachChoiceCartao {

private Cartao cartao;

	@Test
	public void test1(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 
	
	@Test
	public void test2(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	}
	
	@Test
	public void test3(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(false, cartao.salCartao(cartao)); 
	} 
}

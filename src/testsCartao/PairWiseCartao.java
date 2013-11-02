package testsCartao;

import static org.junit.Assert.assertEquals;
import main.Cartao;

import org.junit.Test;

public class PairWiseCartao {
	
private Cartao cartao;
	

	@Test
	public void test1(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test2(){
		Cartao cartao = new Cartao("estudante", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 
	
	@Test
	public void test3(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(false, cartao.salCartao(cartao)); 
	} 

	@Test
	public void test4(){
		Cartao cartao = new Cartao("livre", -1);
		assertEquals(false, cartao.addCredito(cartao, 10));  
	} 
	
	@Test
	public void test5(){
		Cartao cartao = new Cartao("livre", -1);
		assertEquals(false, cartao.addCredito(cartao, 10));  
	} 
		
	@Test
	public void test6(){
		Cartao cartao = new Cartao("inteira", -1);
		assertEquals(false, cartao.salCartao(cartao)); 
	} 
	
	@Test
	public void test7(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test8(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(false, cartao.addCredito(cartao, 10));  
	}
	
	public void test9(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(false, cartao.salCartao(cartao)); 
	} 
	
	
	public void test10(){
		Cartao cartao = new Cartao("inteira", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test11(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	}
	
	@Test
	public void test12(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	}
}

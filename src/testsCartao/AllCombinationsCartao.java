package testsCartao;

import static org.junit.Assert.*;
import main.Cartao;
import org.junit.Test;

public class AllCombinationsCartao {

	private Cartao cartao;
	

	@Test
	public void test1(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test2(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test3(){
		Cartao cartao = new Cartao("livre", 0);
		assertEquals(0, cartao.salCartao(cartao)); 
	} 
	
	@Test
	public void test4(){
		Cartao cartao = new Cartao("estudante", 0);
		assertEquals(true, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test5(){
		Cartao cartao = new Cartao("estudante", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test6(){
		Cartao cartao = new Cartao("estudante", 0);
		assertEquals(0, cartao.salCartao(cartao)); 
	} 
	

	@Test
	public void test7(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(true, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test8(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test9(){
		Cartao cartao = new Cartao("inteira", 0);
		assertEquals(0, cartao.salCartao(cartao)); 
	} 
	
	@Test
	public void test10(){
		Cartao cartao = new Cartao("livre", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test11(){
		Cartao cartao = new Cartao("livre", -1);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test12(){
		Cartao cartao = new Cartao("livre", -1);
		assertEquals(0, cartao.salCartao(cartao)); 
		//aceitou criar cartao livre com valor negativo
	} 
	
	@Test
	public void test13(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test14(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test15(){
		Cartao cartao = new Cartao("estudante", -1);
		assertEquals(0, cartao.salCartao(cartao)); 
		//aceitou criar cartao livre com valor negativo
	} 
	
	@Test
	public void test16(){
		Cartao cartao = new Cartao("inteira", -1);
		assertEquals(false, cartao.addCredito(cartao, 10)); 
	} 
	
	@Test
	public void test17(){
		Cartao cartao = new Cartao("inteira", -1);
		assertEquals(false, cartao.debCartao(cartao, 10)); 
	} 

	@Test
	public void test18(){
		Cartao cartao = new Cartao("inteira", -1);
		assertEquals(0, cartao.salCartao(cartao)); 
		//aceitou criar cartao livre com valor negativo
	} 
	
}

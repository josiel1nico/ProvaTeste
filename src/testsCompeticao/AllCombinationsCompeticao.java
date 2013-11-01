package testsCompeticao;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.Competicao;

public class AllCombinationsCompeticao {

	private Competicao competicao;
	
	
	@Before
	public void Startup(){
		this.competicao = new Competicao();
	}
	
	@Test
	public void test1() {
		assertEquals(true, competicao.resultado(10, 5, 10));
		
		
	}
	
	@Test
	public void test2() {
		assertEquals(false, competicao.resultado(1, 1, 10));
	}
	
	@Test
	public void test3() {
		assertEquals(false, competicao.resultado(1, 0, 1));
	}
	
	@Test
	public void test4() {
		assertEquals(false, competicao.resultado(0, 0, 10001));
	}
	
	@Test
	public void test5() {
		assertEquals(false, competicao.resultado(1, 1, 0));
	}
	
	@Test
	public void test6() {
		assertEquals(false, competicao.resultado(1, 1, 0));
	}
	
	@Test
	public void test7() {
		assertEquals(false, competicao.resultado(1, 1, 0));
	}
	
	@Test
	public void test8() {
		assertEquals(false, competicao.resultado(1, 1, 0));
	}
}


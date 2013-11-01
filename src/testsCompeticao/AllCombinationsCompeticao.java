package testsCompeticao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Competicao;
import main.CompeticaoCorrigida;

public class AllCombinationsCompeticao {

	private Competicao competicao;
	//private CompeticaoCorrigida competicao;

	@Before
	public void Startup() {
		this.competicao = new Competicao();
		//this.competicao = new CompeticaoCorrigida();
	}

	@Test
	public void test1() {
		int c1b1 = 1;
		int c2b1 = 1;
		int c3b1 = 1;
		assertEquals(true, competicao.resultado(c1b1, c2b1, c3b1));

	}

	@Test
	public void test2() {
		int c1b1 = 1;
		int c2b1 = 1;
		int c3b2 = 10001;
		assertEquals(false, competicao.resultado(c1b1, c2b1, c3b2));
	}

	@Test
	public void test3() {
		int c1b1 = 1;
		int c2b2 = 0;
		int c3b1 = 1;
		assertEquals(false, competicao.resultado(c1b1, c2b2, c3b1));
	}

	@Test
	public void test4() {
		int c1b1 = 1;
		int c2b2 = 10001;
		int c3b2 = 10001;
		assertEquals(false, competicao.resultado(c1b1, c2b2, c3b2));
	}

	@Test
	public void test5() {
		int c1b2 = -1;
		int c2b1 = 1000;
		int c3b1 = 1000;
		assertEquals(false, competicao.resultado(c1b2, c2b1, c3b1));
	}

	@Test
	public void test6() {
		int c1b2 = -1;
		int c2b1 = 1000;
		int c3b2 = 10001;
		assertEquals(false, competicao.resultado(c1b2, c2b1, c3b2));
	}

	@Test
	public void test7() {
		int c1b2 = -1;
		int c2b2 = 10001;
		int c3b1 = 1000;
		assertEquals(false, competicao.resultado(c1b2, c2b2, c3b1));
	}

	@Test
	public void test8() {
		int c1b2 = -1;
		int c2b2 = 10001;
		int c3b2 = 10001;
		assertEquals(false, competicao.resultado(c1b2, c2b2, c3b2));
	}
	
	@After
	public void TearDown(){
		this.competicao = null;
	}
}

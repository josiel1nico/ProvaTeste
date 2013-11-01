package testsCompeticao;

import static org.junit.Assert.assertEquals;
import main.Competicao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EachChoiceCompeticao {

	private Competicao competicao;

	@Before
	public void Startup() {
		this.competicao = new Competicao();
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

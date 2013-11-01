package testsCompeticao;

import main.Competicao;

import org.junit.After;
import org.junit.Before;

public class PairWiseCompeticao {

	private Competicao competicao;

	@Before
	public void Startup() {
		this.competicao = new Competicao();
	}
	
	
	
	
	
	@After
	public void TearDown(){
		this.competicao = null;
	}
	
}

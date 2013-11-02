package testsDNA;

import static org.junit.Assert.assertEquals;
import main.Genoma;

import org.junit.Before;
import org.junit.Test;

public class EachChoiceDNA {
	private Genoma dna;

	@Before
	public void Startup() {
		this.dna = new Genoma();
	}
	
	@Test
	public void test1(){
		dna.setTamanhoCadeias(3, 20);
		dna.setCadeiaP("TCA");
		dna.setCadeiaT("TCATATGCAAATAGCTGCAT");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test2(){
		dna.setTamanhoCadeias(20, 3);
		dna.setCadeiaP("TCATATGCAAATAGCTGCAT");
		dna.setCadeiaT("TCA");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test3(){
		dna.setTamanhoCadeias(4, 20);
		dna.setCadeiaP("CATA");
		dna.setCadeiaT("TCATATGCAAATAGCTGCAT");
		assertEquals("24",dna.getResult());
	}
}

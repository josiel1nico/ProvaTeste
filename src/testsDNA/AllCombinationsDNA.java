package testsDNA;

import static org.junit.Assert.*;
import main.Genoma;

import org.junit.Before;
import org.junit.Test;

public class AllCombinationsDNA {
	private Genoma dna;
	//private CompeticaoCorrigida competicao;

	@Before
	public void Startup() {
		this.dna = new Genoma();
		//this.competicao = new CompeticaoCorrigida();
	}
	
	@Test
	public void test1(){
		dna.setTamanhoCadeias(4, 4);
		dna.setCadeiaP("CATA");
		dna.setCadeiaT("CATA");
		assertEquals("10",dna.getResult());
	}
	@Test
	public void test2(){
		dna.setTamanhoCadeias(20, 20);
		dna.setCadeiaP("TCATATGCAAATAGCTGCAT");
		dna.setCadeiaT("TCATATGCAAATAGCTGCAT");
		assertEquals("10",dna.getResult());
	}
	@Test
	public void test3(){
		dna.setTamanhoCadeias(3, 20);
		dna.setCadeiaP("TCA");
		dna.setCadeiaT("TCATATGCAAATAGCTGCAT");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test4(){
		dna.setTamanhoCadeias(20, 3);
		dna.setCadeiaP("TCATATGCAAATAGCTGCAT");
		dna.setCadeiaT("TCA");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test5(){
		dna.setTamanhoCadeias(3, 3);
		dna.setCadeiaP("TCA");
		dna.setCadeiaT("TCA");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test6(){
		dna.setTamanhoCadeias(21, 21);
		dna.setCadeiaP("TCATATGCAAATAGCTGCATA");
		dna.setCadeiaT("TCATATGCAAATAGCTGCATA");
		assertEquals("00",dna.getResult());
	}
	@Test
	public void test7(){
		dna.setTamanhoCadeias(4, 20);
		dna.setCadeiaP("CATA");
		dna.setCadeiaT("TCATATGCAAATAGCTGCAT");
		assertEquals("24",dna.getResult());
	}
	@Test
	public void test8(){
		dna.setTamanhoCadeias(20, 4);
		dna.setCadeiaP("TCATATGCAAATAGCTGCAT");
		dna.setCadeiaT("CATA");
		assertEquals("00",dna.getResult());
	}
}

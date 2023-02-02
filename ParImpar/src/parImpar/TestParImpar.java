package parImpar;

import junit.framework.TestCase;

public class TestParImpar extends TestCase {
		
	public void testPar() {
		
		assertEquals("Par", ParImpar.parImpar(2));
		assertEquals("Par", ParImpar.parImpar(120));
		assertEquals("Par", ParImpar.parImpar(2006));
	}
	
	public void testImpar() {
		
		assertEquals("Impar", ParImpar.parImpar(9));
		assertEquals("Impar", ParImpar.parImpar(39));
		assertEquals("Impar", ParImpar.parImpar(4011));
	}
	

}
	

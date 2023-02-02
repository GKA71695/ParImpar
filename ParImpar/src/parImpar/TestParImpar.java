package parImpar;

import junit.framework.TestCase;

public class TestParImpar extends TestCase {
		
	public void TestPar() {
		
		assertEquals("Par", ParImpar.parImpar(2));
	}
	
	public void TestImpar() {
		
		assertEquals("Impar", ParImpar.parImpar(3));

	}
		
}
	

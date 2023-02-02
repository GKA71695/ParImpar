package parImpar;

public class ParImpar {
		
	public static String parImpar(int nume) { 
		
		String res="";
		if (nume% 2== 0){
			res = "Par";
		}
		else {
			res ="Impar";
		}
		return res;
	}
	
}


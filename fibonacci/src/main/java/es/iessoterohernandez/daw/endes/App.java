package es.iessoterohernandez.daw.endes;

public class App {

	public int [] metodoFibonacci(int n) {
		
		int[] s = new int[n];
		
		s[0] = 1;
		s[1] = 1;
		
		// Fn = Fn-1 + Fn2
		for (int i = 2; i < n; i++) {
			s[i] = s[i-1] + s[i-2];
		}
		
		return s;
	}
	 
	 
 }    
 

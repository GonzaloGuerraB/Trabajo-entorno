package es.iessoterohernandez.daw.endes;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMain {
	
	public static void main(String[] args) {
		
	
	
		
		App f = new App();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero:");
		
		int num = sc.nextInt();
		
		
		
		System.out.println("El metodo es: " + Arrays.toString(f.metodoFibonacci(num)));
		
	}
	
}

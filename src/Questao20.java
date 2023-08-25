import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
	    if(A>10 || A+B==20)
		System.out.println("numeros validos");
	    
	    else
	    	System.out.println("numero nao valido");
	    
	    System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}
	
}

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
	    if(A>10 || A+B==20)
		System.out.println("numero valido");
	    
	    else if(A==B)
		System.out.println("A eh igual B");
		
	    else if(A<10 && B!=10)
		System.out.println("A eh menor que 10");	
	    
	    else
	    	System.out.println("numero nao valido");
	}

}

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
	    if(A>10)
		System.out.println("A > 10");
	    
	    if(A+B==20)
		System.out.println("A + B == 20");
		
		if(A<=10 && A+B != 20)
		System.out.println("numeros nao validos");	
	}

}

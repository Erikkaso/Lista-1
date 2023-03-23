import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
		if(A>10 || A+B == 20)
		System.out.println("numero valido");	

		else if(A==B)
		System.out.println("A eh igual B; A e B sao diferentes de 10; A eh menor que 10");
		
		else
		System.out.println("numero nao valido");
	}

}

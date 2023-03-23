import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
	int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
		if(A>10){/*nao especifica o que fazer caso A>10*/}
		else
		System.out.println("numero menor que 10");	
		
		if(A+B == 20){/*nao especifica o que fazer caso A+B==20*/}
		else
		System.out.println("numero diferente de 20");
	}

}

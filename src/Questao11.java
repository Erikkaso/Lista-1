import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
	int A,B;
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("adcione valor de 'A'");
		A = valor.nextInt();
		
		System.out.println("agora adcione valor de 'B'");
		B = valor.nextInt();
		valor.close();
		
		if(A>10) {/*nao especifica o que fazer caso A>10*/}

		else if(A+B==20) {/*nao especifica o que fazer caso A + B = 20*/}
			
		System.out.println("A + B == 20");
		
		if(A<10 && A+B!=20)
		System.out.println("numero não valido");

	}

}

package calculosMatematicosEj5;

public class calculosMatematicosEj5App {

	public static void main(String[] args) {
		System.out.println("Ejercicio 5: ");

		int A=2;
		int B=4;
		int C=6;
		int D=8;
		System.out.println("valor de A es "+A);
		System.out.println("valor de B es "+B);
		System.out.println("valor de C es "+C);
		System.out.println("valor de D es "+D);
		
		int valorA=A;
		int valorB=B;
		int valorC=C;
		int valorD=D;
		
		B=valorC;
		C=valorA;
		A=valorD;
		D=valorB;
		System.out.println("NUEVO valor de A es "+A);
		System.out.println("NUEVO valor de B es "+B);
		System.out.println("NUEVO valor de C es "+C);
		System.out.println("NUEVO valor de D es "+D);



	}

}

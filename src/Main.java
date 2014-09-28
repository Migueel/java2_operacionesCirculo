import java.util.Scanner;

//Programa para visualizar en pantalla el area y la circunferencia del circulo.

public class Main {
	
	public static void main (String args[]) {

	double radio, area, circunferencia;
			
		Circulo operaciones = new Circulo();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio del círculo");
		radio = sc.nextDouble();
		
		area = operaciones.area(radio);
		circunferencia = operaciones.circun(radio);

	System.out.println("El área del círculo es:" + area);
	System.out.println("La circunferencia del círculo es:" + circunferencia);
	}
}


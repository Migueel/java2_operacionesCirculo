public class Circulo {

double radio;
double pi= 3.1416;

//Metodo para calcular el area de una circunferencia
	public double area (double radio) {
		
		double result = radio * radio * pi;
		return result;
	}

//Metodo para calcular la circunferencia
	public double circun (double radio) {
		
		double result = 2 * pi * radio;
		return result;
	}
}

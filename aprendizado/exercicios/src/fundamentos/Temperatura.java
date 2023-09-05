package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double ajuste = 32;
		final double fator = 5/9.0;
		
		double tempFarenheit = 86;		
		double tempCelsius = (tempFarenheit - ajuste) * fator;
		
		System.out.println("O resultado é " + tempCelsius + "ºC");
		
		tempFarenheit = 150;		
		tempCelsius = (tempFarenheit - ajuste) * fator;
		System.out.println("O resultado é " + tempCelsius + "ºC");


	}
}

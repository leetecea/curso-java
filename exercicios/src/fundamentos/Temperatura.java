package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		
//		 (°F - 32) x 5/9 = °C
		
		double fahrenheit = 65;
		final int diferenca = 32;
		final double fator = 5.0/9.0;
		
		double celsius = (fahrenheit - diferenca) * fator;
		System.out.println("Temperatura: " + celsius + "°C");
		
		
		
	}
}

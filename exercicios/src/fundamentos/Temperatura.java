package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		
//		 (°F - 32) x 5/9 = °C
		
		double fahrenheit = 65;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Temperatura: " + celsius + "°C");
		
		
		
	}
}

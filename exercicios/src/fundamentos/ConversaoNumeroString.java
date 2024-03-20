package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 =  1000; // funciona para os outros tipos, como Double, Long, Short
		// Usando .toString()
		System.out.println(num1.toString().length());
		
		
		int num2 =  100000;
		// Usando Integer.toString()
		System.out.println(Integer.toString(num2).length());
		
		
		//Concatenando com uma string
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}

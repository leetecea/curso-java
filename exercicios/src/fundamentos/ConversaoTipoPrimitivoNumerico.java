package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		 
		double a = 1; // nao tem problema ir de int pra double
		System.out.println(a);
		
		float b = (float) 1.626651515665; 
		//1 - (float) conversao explicita (CAST)
		// transformar o literal em float coloca F no final
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;  // explícita (CAST)
		System.out.println(f);
		
		
		// conversões em que não terá problemas: 
		// byte -> short -> int -> long 
		// int -> double
		
		// sempre usar int, quando for valores grander usar double
	}
}

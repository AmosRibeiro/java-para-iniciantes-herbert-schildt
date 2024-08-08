class Advinhador{
	public static void main (String args[])
	throws java.io.IOException {
		char ch, resposta = 'k';
		
		System.out.println("Estou pensando em uma letra entre A e Z.");
		System.out.print("Você consegue advinhar?: ");
		
		ch = (char) System.in.read(); // lê um char no teclado
		
		if(ch == resposta) System.out.println("** ACERTOU **");
		else System.out.println("Errou... a letra correta é: " + resposta);
	}
}

package capitulo3;

class Advinhador{
	public static void main (String args[])
	throws java.io.IOException {
		char ch, ignorar, resposta = 'k';
		
		do {
		System.out.println("Estou pensando em uma letra entre A e Z.");
		System.out.print("Você consegue advinhar?: ");
		
		ch = (char) System.in.read(); // lê um char no teclado
		
		do {
			ignorar = (char) System.in.read();
		} while (ignorar != '\n');

		if(ch == resposta) System.out.println("** PARABÉNS, VOCÊ ACERTOU !!! **");
		else{
			System.out.println("Errou... a resposta está ");
			if(ch < resposta) System.out.println("mais pra frente no alfabeto.");
			else System.out.println("mais pra trás no alfabeto.");
			System.out.println("Tente novamente!\n");
			}	
		} while(resposta != ch); 
	}
}

package capitulo03;

class DoWhile{
	public static void main(String args[])
		throws java.io.IOException{
		char ch;
		
		do {
			System.out.print("Pressione uma tecla seguida por ENTER: ");
			ch= (char) System.in.read(); //obtém um char
		} while (ch != 'q');
	}
}

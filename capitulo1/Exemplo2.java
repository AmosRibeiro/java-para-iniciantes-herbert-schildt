package capitulo1;
/*
	Este código demonstra uma variável.
	
	Chame este arquivo de Exemplo2.java
*/

	class Exemplo2 {
	public static void main(String args []){
	int var1; //esta instrução	declara uma variável
	int var2; //esta instrução declara outra variável
	
	var1 = 1024; //esta instrução atribui 1024 a var1
	
	System.out.println("var1 contains " + var1);//esta instrução imprime na tela um texto concatenado a um variavel
	
	var2 = var1 / 2; //esta instrução faz uma operação 
	
	System.out.print("var2 contains var1 / 2: "); //imprime um texto na tela
	System.out.println(var2); //imprime o valor da variavel na tela
	}
}
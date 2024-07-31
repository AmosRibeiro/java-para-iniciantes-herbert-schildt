/*
	Esse programa ilustra a diferença entre int e double.
	
	Chame esse arquivo de Exemplo3.java
*/
		class Exemplo3 {
			public static void main (String args[]){
				int var;
				double x;
				
				var = 10;
				
				x = 10.0;
				
				System.out.println("Original value of var: " + var);
				System.out.println("Orignal value of x: " + x);
				System.out.println();
				
				var = var / 4;
				x = x /4;
				
				System.out.println("var after division: " + var);
				System.out.println("x after division: " + x);
				
			}
		}
//FIZZBUZZ - 17 de Novembro de 2018 

//Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
//    • Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
//    • Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
//    • Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

package FizzBuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		// Bloco de repetição para contar até 100.
		for (int i = 1; i <= 100; i++) {
			
			// cálculo para checar se o número é divisível por 3 ou po4 5
			int mod3 = i % 3;
			int mod5 = i % 5;
			
			//Checa se é divisível por 3 e 5 ao mesmo tempo.
			if (mod3 == 0 && mod5 == 0) {
				System.out.println("FizzBuzz");
				
			//Checa se é divisível por 3.
			} else if (mod3 == 0) {
				System.out.println("Fizz");
			
			//Checa se é divisível por 5.	
			} else if (mod5 == 0) {
				System.out.println("Buzz");
				
			//Se não for divisível por nada, simplesmente escreve o número.
			} else {
				System.out.println(i);
			}

			/* Versão de Alday Pinheiro 
			 * 
			 * String mod = ""; mod = (i % 3 == 0 && i % 5 == 0) ?
			 * "3 e 5" : (i % 3 == 0) ? "3" : (i % 5 == 0) ? "5" : ""; switch (mod) { case
			 * "3": System.out.println("Fizz"); break; case "5": System.out.println("Buzz");
			 * break; case "3 e 5": System.out.println("FizzBuzz"); default:
			 * System.out.println(i); break; }
			 */
		}
	}
}

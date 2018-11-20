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

			// Checa se é divisível por 3 e 5 ao mesmo tempo.
			if (mod3 == 0 && mod5 == 0) {
				System.out.println("FizzBuzz");

				// Checa se é divisível por 3.
			} else if (mod3 == 0) {
				System.out.println("Fizz");

				// Checa se é divisível por 5.
			} else if (mod5 == 0) {
				System.out.println("Buzz");

				// Se não for divisível por nada, simplesmente escreve o número.
			} else {
				System.out.println(i);
			}
	//===================================================================
		/*
			// VERSÃO DE ALDAY PINHEIRO
			
			//Criado Variável String vazia
			String mod = "";
			
			//Criando o IF ternário
			//Nesse caso, existem 3 IF ternários, ele é criado da seguinte forma:
			// variavel = ( condição ) ? Verdadeiro : False;
			
			//Nesse caso séria parecido com o portugol do visuAlg, onde escreve a condição dentro do
			//parentes, o parenteses seria o "se", esse "?" seria o então, e os ":" seria o senão
			
			
			
			mod = (i % 3 == 0 && i % 5 == 0) ? "3 e 5" : (i % 3 == 0) ? "3" : (i % 5 == 0) ? "5" : "";
			
			//Método Switch-Case	
			//Esse método é como o IF, dentro do parentêses de switch, entra a variável a ser testada,
			//e os cases são os possíveis valores para a variável.
			switch (mod) {
			case "3":
				System.out.println("Fizz");
				break;
			case "5":
				System.out.println("Buzz");
				break;
			case "3 e 5":
				System.out.println("FizzBuzz");
			default://Se não entrar em nenhum dos casos, ele sempre chamara o default.
				System.out.println(i);
				break;
			}
			*/
		}
	}
}

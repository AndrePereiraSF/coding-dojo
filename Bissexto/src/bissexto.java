import java.util.Scanner;

public class bissexto {
	public static void main(String[] args) {
		
		// Entrada dos dados
		Scanner input = new Scanner(System.in);//Criando o Scanner
		System.out.print("Digite o ano: ");
		int num = input.nextInt();//Recebe o ano inserido no console  
		
		// Cálculo dos módulos do ano inserido
		int mod1 = num % 4;
		int mod2 = num % 100;
		int mod3 = num % 400;
		
		//Condição para saber se o ano é bissexto!
		if(mod1 == 0) { //Testa se é divisivel por 4
			if(mod2!=0) { // Testa se NÃO é divisivel por 100
				System.out.println("É Bissexto");
			}
			else if(mod3==0) { //Testa se é divisivel por 400
				System.out.println("É Bissexto");
			}
		}
		else {//Se ele não for dividido por 4, ele Não é bissexto de modo algum.
			System.out.println("Não é Bissexto");
		}
		
}
}

//BISSEXTO - 9 Novembro de 2018 

//A cada 4 anos, a diferença de horas entre o ano solar e o do calendário convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15 minutos e 864 milésimos de segundo). Para compensar essa diferença e evitar um descompasso em relação às estações do ano, insere-se um dia extra no calendário e o mês de fevereiro fica com 29 dias. Essa correção é especialmente importante
//para atividades atreladas às estações, como a agricultura e até mesmo as festas religiosas. Um determinado ano é bissexto se:
// 
//     • O ano for divisível por 4, mas não divisível por 100, exceto se ele for também divisível por 400.

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

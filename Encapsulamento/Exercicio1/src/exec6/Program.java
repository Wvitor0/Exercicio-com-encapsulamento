package exec6;

import java.util.Scanner;
import java.util.Locale;
import entities.Application;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número da conta: ");
		int account = sc.nextInt();
		
		System.out.print("Nome do titular da conta: ");
		String name = sc.next();
		
		Application app = new Application(name, account);
		
		System.out.print("Deseja realizar um depósito inicial (s/n)?");
		String decision = sc.next();
		
		if (decision.charAt(0) == 's') {
			System.out.print("Digite o valor de depósito: ");
			double value = sc.nextDouble();
			app.soma(value);
			System.out.println();
			System.out.println(app);
			}
		else {
			System.out.println(app);
		}
		
		System.out.print("Deseja realizar um depósito? (s/n)");
		String deposit = sc.next();
		
		if(deposit.charAt(0) == 's') {
			System.out.print("Valor a ser depositado: ");
			double deposito = sc.nextDouble();
			app.soma2(deposito);
		}
		
		else {
			System.out.println(app);;
		}
		
		System.out.println("\nDADOS ATUALIZADOS");
		System.out.println(app);
		
		System.out.println("Realize um saque: ");
		double sub = sc.nextDouble();
		app.subtracao(sub);
		
		System.out.println("\nDADOS ATUALIZADOS");
		System.out.println(app );
		
		sc.close();	
	}
}

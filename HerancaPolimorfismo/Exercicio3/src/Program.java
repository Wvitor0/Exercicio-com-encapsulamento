import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> lista = new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1) + "#: ");
			System.out.print("Comum, Usado, ou Importado (c / u / i)? ");
			String r = sc.next();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();				
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if(r.charAt(0) == 'c'){			
				lista.add(new Product(nome, preco));
			}
			
			if(r.charAt(0) == 'u'){			
				System.out.print("Data de compra (dd/MM/yyyy): ");
				Date data = sdf1.parse(sc.next());
				lista.add(new UsedProduct(nome, preco, data));
			}
			
			if(r.charAt(0) == 'i') {
				System.out.print("Taxa de importação: ");
				double taxa = sc.nextDouble();
				lista.add(new ImportedProduct(nome, preco, taxa));
			}
		}
		
		for(Product produtos : lista) {
			System.out.println(produtos.priceTag());
		}
		sc.close();
	}

}

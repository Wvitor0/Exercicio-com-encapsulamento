package entities;

public class Application {
	private String name;
	private int account;
	private double value;
	
	public Application (){
	}
	
	public Application(String name, int account) {
		this.name = name;
		this.account = account;
	}
	
	public Application(String name, int account, double value) {
		this.name = name;
		this.account = account;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAccount() {
		return account;
	}
	
	public double getValue() {
		return value;
	}
	
	public void soma (double value) {
		this.value += value;
	}
	
	public void soma2 (double deposito) {
		this.value += deposito;
	}
	
	public void subtracao (double sub) {
		this.value -= sub;
	}
	
	public String toString() {
		return "Dados da conta \n" + 
				"\n" + 
				"Conta: " + 
				account + 
				"\n" + 
				"Titular: " + 
				name + "\n" + 
				"Valor: " + 
				String.format("%.2f\n", this.value);
	}
}

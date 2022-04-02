
public class Main {
	
	public static void main(String[] args) {
		
		Cliente priscila = new Cliente();
		priscila.setNome("Priscila");
		
		Conta cc = new ContaCorrente(priscila);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(priscila);
		cc.transferir(cp, 50);
		
		cc.extrato();
		cp.extrato();
		
	}

}

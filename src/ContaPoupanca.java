
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extrato() {
		
			System.out.println("=== Extrato Conta Poupança ===");
			super.imprimirInfosComuns();
		
	}

	
}


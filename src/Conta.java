
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADARO = 1;
	private static int SEQUENCIAL = 1; 
	
	private int agencia;
	private int numero;
	private double saldo;
	
	protected Cliente cliente;
		
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADARO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	

	
}

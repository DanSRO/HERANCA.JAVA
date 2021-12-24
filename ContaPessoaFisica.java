package heranca;

public class ContaPessoaFisica extends Conta{
	String cpf;
	
	
	public void depositar(double valor) {
		saldo=saldo+valor+1;
		System.out.println(" Saldo: "+this.saldo);
	}
	public void MostraConta() {
		System.out.println(" CPF: "+this.cpf+"\n"+" Agencia: "+this.agencia+"\n"+" Saldo: "+this.saldo);
	}

}

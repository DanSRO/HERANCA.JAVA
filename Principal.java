package heranca;

public class Principal {

	public static void main(String[] args) {
		ContaPessoaFisica pf1= new ContaPessoaFisica();
		pf1.agencia=1;
		pf1.cpf="12345678999";
		pf1.saldo=1000;
				
		ContaPessoaJuridica pj1= new ContaPessoaJuridica();
		pj1.agencia=1;
		pj1.cnpj="99987654321";
		
		pf1.MostraConta();
		pj1.MostraConta();
		pf1.depositar(100);
	}
}

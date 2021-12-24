package heranca;

public class ContaPessoaJuridica extends Conta {
	String cnpj;
public void MostraConta() {
	System.out.println(" CNPJ: "+this.cnpj+"\n"+" Agencia: "+this.agencia+"\n");
}
}
package ex2;

public class Vendedor extends Empregado{
	public double valorVendas;
	public double comissao;
	
	public double calcularSalarioVendedor() {
		double salarioVendedor = (salarioBase + valorVendas*comissao/100) - (salarioBase + valorVendas*comissao/100)*imposto/100;
		return salarioVendedor;
	}

}

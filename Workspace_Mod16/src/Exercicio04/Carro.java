package Exercicio04;

public class Carro implements Veiculo {

	String marca;
	String modelo;
	Integer potenciaDoMotor;
	String tipoDoVeiculo;
	double preco;
	boolean statusDoMotor;

	public Carro(String marca, String modelo, Integer potenciaDoMotor, String tipoDoVeiculo, double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.potenciaDoMotor = potenciaDoMotor;
		this.tipoDoVeiculo = tipoDoVeiculo;
		this.preco = preco;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(Integer potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	public String getTipoDoVeiculo() {
		return tipoDoVeiculo;
	}

	public void setTipoDoVeiculo(String tipoDoVeiculo) {
		this.tipoDoVeiculo = tipoDoVeiculo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void ligarMotor() {
		this.statusDoMotor = true;
	}

	public void desligarMotor() {
		this.statusDoMotor = false;
	}

	public boolean statusDoMotor() {
		return statusDoMotor;
	}

	public String obterMarca() {
		return marca;
	}

}

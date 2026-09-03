package br.com.fiapride.model;

public class Veiculos {

	private String nome;
	private String placa;
	private double gasolina;

 
	public Veiculos(String nome, String placa) {
        this.setNome(nome);
        this.setPlaca(placa);
        this.setGasolina(0); // Todo mundo começa com zero!
    }
	
    public double getGasolina() {
        return this.gasolina; 
    }

    private void setGasolina(double gasolina) {
        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            System.out.println("Erro não é possivel colocar um valor negativo!");
        }
    }

    public void adicionarGasolina(double valor) {
    		if (valor <= 0) {
    			System.out.println("Erro: O valor de recarga deve ser maior que zero.");

            return;
        }
        this.gasolina += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.gasolina);
    }
    
    public void gasta(double valor) {
    	if (valor<=0) {
    		System.out.println("o valor da gasolina diminuiu");
    }
    else {
    	System.out.println("Perigo: consome mais que o disponivel");
    }
    
    }
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }


	}

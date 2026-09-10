package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

	public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---\n");

        Veiculos veiculo = new Veiculos("Carlos", "ABC-1234");

        veiculo.adicionarGasolina(50);
        veiculo.gasta(100);

        System.out.println("\n--- Status do Veiculo ---");
        System.out.println(
            "Nome: " + veiculo.getNome()
            + " | Placa: " + veiculo.getPlaca()
            + " | Gasolina: " + veiculo.getGasolina()
        );
    }
}
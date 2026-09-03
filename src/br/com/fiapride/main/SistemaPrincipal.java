package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        System.out.println("--- Iniciando o Sistema FiapRide --- \n");
        
        Veiculos veiculo1 = new Veiculos("Carlos", "ABC-1234");
        veiculo1.adicionarGasolina(50);
        veiculo1.gasta(100);
        

        Veiculos veiculo2 = new Veiculos("Ana", "DEF-5678");
        veiculo2.adicionarGasolina(80);
        veiculo2.gasta(100);


        System.out.println("\n--- Status dos Veiculos ---");
        System.out.println("Nome: " + veiculo1.getNome() + " | Gasolina (saldo): R$ " + veiculo1.getGasolina() + " | Placa: " + veiculo1.getPlaca());
        System.out.println("Nome: " + veiculo2.getNome() + " | Gasolina (saldo): R$ " + veiculo2.getGasolina() + " | Placa: " + veiculo2.getPlaca());
        

    }
}
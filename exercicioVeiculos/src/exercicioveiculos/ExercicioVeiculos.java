/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioveiculos;

/**
 *
 * @author 10723111573
 */
public class ExercicioVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarroPasseio carro = new CarroPasseio(1200, 180, 60000, "Prata", "Sedan");
        Caminhao caminhao = new Caminhao(5000, 120, 150000, 10, 4, 10);
        

        System.out.println("Carro Passeio:");
        System.out.println("Peso: " + carro.getPeso() + " kg");
        System.out.println("Velocidade Máxima: " + carro.getVeloMax() + " km/h");
        System.out.println("Preço: R$ " + carro.getPreco());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());

        System.out.println();

        
        System.out.println("Caminhão:");
        System.out.println("Peso: " + caminhao.getPeso() + " kg");
        System.out.println("Velocidade Máxima: " + caminhao.getVeloMax() + " km/h");
        System.out.println("Preço: R$ " + caminhao.getPreco());
        System.out.println("Toneladas: " + caminhao.getToneladas() + " t");
        System.out.println("Altura Máxima: " + caminhao.getAlturaMax() + " m");
        System.out.println("Comprimento: " + caminhao.getComprimento() + " m");

    }
    
}

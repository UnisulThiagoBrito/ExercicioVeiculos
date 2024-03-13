/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioveiculos;

/**
 *
 * @author 10723111573
 */
public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(int peso, int veloMax, float preco, String cor, String modelo) {
        super(peso, veloMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
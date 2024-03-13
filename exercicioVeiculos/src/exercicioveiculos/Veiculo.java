/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioveiculos;

/**
 *
 * @author 10723111573
 */
public class Veiculo {
    private int peso;
    private int veloMax;
    private float preco;

    public Veiculo() {
    }

    public Veiculo(int peso, int veloMax, float preco) {
        this.peso = peso;
        this.veloMax = veloMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}

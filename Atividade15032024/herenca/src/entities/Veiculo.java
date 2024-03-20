/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 18/03/2024
 * @brief Class Veiculo
 */
public  class Veiculo {

    public int Total;
    public String placa;
    public int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public void setano(String placa) {
        this.ano = ano;
    }

    public String getplaca() {
        return placa;
    }

    public int getano() {
        return ano;
    }
    
    public void cadastrarVeiculos(String placa, int ano) {
        Total += 1;
        this.ano = ano;
        this.placa = placa;
    }
    public void removerVeiculos(int quantidade) {
        Total -= Total;
        ano = 0;
        this.placa = "";
    }
    public void editarVeiculos(String placa, int ano) {
        this.ano = ano;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [Placa= " + placa + ", Ano= " + ano + ", Total= " + Total + "]";
    }
}

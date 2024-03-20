/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 20/03/2024
 * @brief Class Caminhao
 */
public class Caminhao extends Veiculo{

public int eixos;    
    
public Caminhao (String placa, int ano, int eixos) {

    this.placa = placa;
    this.ano = ano;
    this.eixos = eixos;
}
 public void seteixos(int eixos) {
        this.eixos = eixos;
    }

    public int geteixos() {
        return eixos;
    }

    @Override
    public String toString() {
        return "Veiculo [Placa= " + placa + ", Ano= " + ano + "]";
    }
}

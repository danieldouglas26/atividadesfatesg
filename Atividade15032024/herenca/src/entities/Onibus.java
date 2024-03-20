/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 20/03/2024
 * @brief Class Onibus
 */
public class Onibus extends Veiculo{

public int assentos;    
    
public Onibus (String placa, int ano, int assentos) {

    this.placa = placa;
    this.ano = ano;
    this.assentos = assentos;
}
 public void setassentos(int assentos) {
        this.assentos = assentos;
    }

    public int getassentos() {
        return assentos;
    }

    @Override
    public String toString() {
        return "Veiculo [Placa= " + placa + ", Ano= " + ano + "]";
    }
}

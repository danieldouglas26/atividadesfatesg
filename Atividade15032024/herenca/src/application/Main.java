/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Veiculo;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 20/03/2024
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcaoMenu = 0;

        Veiculo veiculo = new Veiculo();

        while (opcaoMenu != 5) {

            System.out.println("Cadastro de veiculos: ");
            System.out.println("1 - Cadastrar veiculos");
            System.out.println("2 - Visualizar veiculos");
            System.out.println("3 - Excluir veiculos");
            System.out.println("4 - Editar veiculos");
            System.out.println("5 - SAIR");
            System.out.print("Opcao: ");

            opcaoMenu = sc.nextInt();
            if (opcaoMenu > 5) {
                System.out.println();
                System.out.println("Opcao invalida!");
                System.out.println();
            }

            switch (opcaoMenu) {

                case 1:
                    System.out.println();
                    System.out.print("Quantos veiculos deseja adicionar? ");
                    int quantidade = sc.nextInt();
                    String placa = "";
                    int ano = 0;

                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Placa: ");
                        placa = sc.next();
                        System.out.print("Ano: ");
                        ano = sc.nextInt();
                    }

                    veiculo.cadastrarVeiculos(placa, ano);
                    System.out.println("Update: " + veiculo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    if (veiculo.ano != 0) {
                        System.out.println("Veiculos: " + veiculo);
                    } else {
                        System.out.println("Sem veiculos cadastrados!");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Quantos veiuculos deseja remover? ");
                    quantidade = sc.nextInt();
                    veiculo.removerVeiculos(quantidade);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    if (veiculo.ano != 0) {
                        System.out.println("Veiculo atual: " + veiculo);
                        System.out.print("Digite a nova placa: ");
                        placa = sc.next();
                        System.out.print("Digite o novo ano: ");
                        ano = sc.nextInt();
                        veiculo.editarVeiculos(placa, ano);
                        System.out.println("Update: " + veiculo);
                    } else {
                        System.out.println("Sem veiculos cadastrados!");
                    }

                    System.out.println();
                    break;
                case 5:

            }

        }
    }

}

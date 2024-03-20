/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exaula08;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 14/03/2024
 * @brief Class Teste
 */
public class Teste {

    //Função para limpar a tela do console 
    public static void limpaTela() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        int opcaoMenu = 0, ladoFigura = 0, ladoRetangulo, ladoRetangulo1;
        double ladoTriangulo, ladoTriangulo1, raioCirculo;
        String corFigura, esperaSair;

        while (opcaoMenu != 5) {

            Scanner ler = new Scanner(System.in);

            System.out.println("");
            System.out.println("Escolhe uma forma geometrica: ");
            System.out.println("");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Triangulo");
            System.out.println("4 - Circulo");
            System.out.println("5 - SAIR");

            System.out.println("");
            System.out.print("Opcao: ");
            opcaoMenu = ler.nextInt();

            switch (opcaoMenu) {

                case 1:
                    limpaTela();
                    Quadrado quadrado = new Quadrado();
                    System.out.println("Impute a cor da figura: ");
                    corFigura = ler.next();
                    quadrado.setCor(corFigura);
                    System.out.println("Impute um valor de um lado do quadrado: ");
                    ladoFigura = ler.nextInt();
                    quadrado.setlado1(ladoFigura);
                    System.out.println("");
                    System.out.println(quadrado);
                    System.out.println("Aperte qualquer teclado para sair....");
                    esperaSair = ler.next();
                    limpaTela();
                    break;
                case 2:
                    limpaTela();
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Impute a cor da figura: ");
                    corFigura = ler.next();
                    retangulo.setCor(corFigura);
                    System.out.println("Impute um valor de um lado do retangulo: ");
                    ladoRetangulo = ler.nextInt();
                    retangulo.setlado1(ladoRetangulo);
                    System.out.println("Impute um valor de um lado do retangulo: ");
                    ladoRetangulo1 = ler.nextInt();
                     retangulo.setlado2(ladoRetangulo1);
                    System.out.println("");
                    System.out.println(retangulo);
                    System.out.println("Aperte qualquer teclado para sair....");
                    esperaSair = ler.next();
                    limpaTela();
                    break;
                case 3:
                    limpaTela();
                    Triangulo triangulo = new Triangulo();
                      System.out.println("Impute a cor da figura: ");
                    corFigura = ler.next();
                    triangulo.setCor(corFigura);
                    System.out.println("Impute um valor da base do triangulo: ");
                    ladoTriangulo = ler.nextInt();
                    triangulo.setbase(ladoTriangulo);
                    System.out.println("Impute um valor da altura do triangulo: ");
                    ladoTriangulo1 = ler.nextInt();
                     triangulo.setaltura(ladoTriangulo1);
                    System.out.println("");
                    System.out.println(triangulo);
                    System.out.println("Aperte qualquer teclado para sair....");
                    esperaSair = ler.next();
                    limpaTela();
                    break;
                case 4:
                    limpaTela();
                    Circulo circulo = new Circulo("Verde", 10.2);
                     System.out.println("Impute a cor da figura: ");
                    corFigura = ler.next();
                    circulo.setCor(corFigura);
                    System.out.println("Impute um valor do raio do circulo: ");
                    raioCirculo = ler.nextInt();
                    circulo.setraio(raioCirculo);
                    System.out.println("");
                    System.out.println(circulo);
                    System.out.println("Aperte qualquer teclado para sair....");
                    esperaSair = ler.next();
                    limpaTela();
                    break;
                case 5:

            }

        }

    }
}

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

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 14/03/2024
 * @brief Class Quadrado
 */
public class Quadrado extends Retangulo {

    public Quadrado() {
        super();
    }

    public Quadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }

    public Quadrado(String cor, double lado) {
        lado = super.getlado1();
    }

    @Override
    public double area() {
        return this.getlado1() * this.getlado1();
    }

    @Override
    public String toString() {
        return "Quadrado [area()=" + area() + ", cor=" + super.getCor() + "]";
    }
}

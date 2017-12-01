/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class Tablero {

    Pieza tabla[][];

    public Tablero() {
        tabla = new Pieza[4][4];
    }

    void set(Pieza A, int x, int y) {
        tabla[x][y] = A;
    }

    Pieza get(int x, int y) {
        return tabla[x][y];
    }

    void crear(int numero, int x, int y) {
        Pieza pieza = new Pieza(numero);
        tabla[x][y] = pieza;
    }
}

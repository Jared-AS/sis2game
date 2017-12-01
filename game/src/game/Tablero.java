/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class Tablero {

    int tabla[][];

    public Tablero() {
        tabla = new int[4][4];
    }

    void intercambiar(Coordenada origen, Coordenada destino) {
        tabla[destino.x][destino.y] = tabla[origen.x][origen.y];
        tabla[origen.x][origen.y] = 16;
    }

    int get(int x, int y) {
        return tabla[x][y];
    }

    void crear(int numero, int x, int y) {
        tabla[x][y] = numero;
    }
}

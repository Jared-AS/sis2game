/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class Juego {

    public static Tablero GenerarTablero() {
        Tablero tablero = new Tablero();
        int[] listaOrdenada = new Asignador().asignarNumeros();
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero.crear(listaOrdenada[cont], i, j);
                cont++;
            }
        }
        return tablero;
    }

}

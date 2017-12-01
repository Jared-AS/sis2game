/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.*;

public class Asignador {

    private int generarNumeroAleatorio(int[] lista) {
        int numero;
        do {
            numero = new Random().nextInt(16) + 1;
        } while (existe(lista, numero));
        return numero;
    }

    public int[] asignarNumeros() {
        int lista[] = new int[16];
        for (int i = 0; i < 16; i++) {
            lista[i] = generarNumeroAleatorio(lista);
        }
        return lista;
    }

    private boolean existe(int[] lista, int indice) {
        for (int i = 0; i < 16; i++) {
            if (lista[i] == indice) {
                return true;
            }
        }
        return false;
    }
}

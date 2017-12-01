/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.*;

public class Asignador {

    Random r = new Random();

    private int randomizador(int a) {
        int number = r.nextInt(a) + 1;
        return number;
    }

    public int[] orden() {
        int a[] = new int[16];
        for (int i = 0; i < 16; i++) {
            int in = randomizador(16);
            if (i == 0) {
                a[i] = in;
            } else {
                if (inspector(a, in) == false) {
                    a[i] = in;
                } else {
                    while (inspector(a, in) == true) {
                        in = randomizador(16);
                    }
                    a[i] = in;
                }
            }
        }

        return a;
    }

    private boolean inspector(int[] array, int indice) {
        boolean resp = false;
        for (int i = 0; i < 16; i++) {
            if (array[i] != 0) {
                if (array[i] == indice) {
                    resp = true;
                }
            }
        }
        return resp;
    }

}

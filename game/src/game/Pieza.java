/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class Pieza {
    int almacen;
    public Pieza(int pi){
    almacen=pi;
    }
    void setValue(int A){
    almacen=A;
    }
    int getValue(){
    return almacen;
    }
}

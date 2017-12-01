/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


public class tablero {
    Pieza tabla[][];
    public tablero(){
    tabla=new Pieza[4][4];
    }
    void set(Pieza A,int x,int y){
    tabla[x][y]=A;
    }
    Pieza get(int x,int y){
    return tabla[x][y];
    }
    Pieza crear(int a){
    Pieza piezaA=new Pieza(a);
    return piezaA;
    }
}

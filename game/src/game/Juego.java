/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


public class Juego
{
    static tablero table=new tablero();
    static Asignador config=new Asignador();
    static int[] ordenada;
    public static void main(String Args[]){
        table=OrdenarTablero();
    }
    static tablero OrdenarTablero(){
       ordenada=config.orden();
       int cont=0;
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
            table.set(table.crear(ordenada[cont]),i,j);
            cont++;
           }
        }
       return table;
       }
    static int[] getOrden(){
    return ordenada;
    }
}

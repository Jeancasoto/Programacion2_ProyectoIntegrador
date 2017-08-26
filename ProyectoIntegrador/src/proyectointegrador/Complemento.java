/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

/**
 *
 * @author jeansoto
 */
public interface Complemento {
    
     abstract boolean movimiento(String [][] matriz, int x, int y, int nx, int ny);
     abstract boolean ganaelrey(String [][] matriz);
     abstract boolean pierdeelrey(String [][] matriz);
     abstract boolean comer(String [][] matriz, int nx, int ny);
     abstract boolean pierdenrebeldes(String [][] matriz);
}

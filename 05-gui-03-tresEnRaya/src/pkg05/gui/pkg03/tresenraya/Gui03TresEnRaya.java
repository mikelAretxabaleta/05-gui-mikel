/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.gui.pkg03.tresenraya;

import javax.swing.JOptionPane;

/**
 *
 * @author m
 */
public class Gui03TresEnRaya {


public static InterfaceJuego interfaceJuego = new InterfaceJuego();
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
	
	Gui03TresEnRaya.comenzarJuego();

		
}

public static void comenzarJuego(){
interfaceJuego.setVisible(true);
}

public static void terminarJuego(){
interfaceJuego.setVisible(false);
interfaceJuego.removeAll();
}
public static void comprobarEmpate(){
if (interfaceJuego.getMovimientos()>8 && !hayGanador(interfaceJuego.getArray())){
JOptionPane.showMessageDialog(interfaceJuego,"Empate!!!!");
interfaceJuego.setVisible(false);
interfaceJuego.setMovimientos(0);
interfaceJuego.setTurno(0);
int[][] arraynuevo={{5,5,5},{5,5,5},{5,5,5}};
interfaceJuego.setArray(arraynuevo);
interfaceJuego.setClick1(false);
interfaceJuego.setClick2(false);
interfaceJuego.setClick3(false);
interfaceJuego.setClick4(false);
interfaceJuego.setClick5(false);
interfaceJuego.setClick6(false);
interfaceJuego.setClick7(false);
interfaceJuego.setClick8(false);
interfaceJuego.setClick9(false);
interfaceJuego.setVisible(true);
}}

public static void ganaO(){
JOptionPane.showMessageDialog(interfaceJuego,"Gana el O!!!!");
Gui03TresEnRaya.terminarJuego();
}

public static void ganaX(){
JOptionPane.showMessageDialog(interfaceJuego,"Gana la X!!!!");
Gui03TresEnRaya.terminarJuego();
}

public static boolean hayGanador(int[][] t) {

        // Primero un jugador y luego el otro
        for (int i = 0; i < 2; i++) {

            // Filas
            if (t[0][0] == i && t[0][1] == i && t[0][2] == i) {
                return true;
            }
            if (t[1][0] == i && t[1][1] == i && t[1][2] == i) {
                return true;
            }
            if (t[2][0] == i && t[2][1] == i && t[2][2] == i) {
                return true;
            }

            // Columnas
            for (int j = 0; j < 3; j++ ) {
                if (t[0][j] == i && t[1][j] == i && t[2][j] == i) {
                    return true;
                }
            }

            // Diagonales
            if (t[0][0] == i && t[1][1] == i && t[2][2] == i) {
                return true;
            }
            if (t[0][2] == i && t[1][1] == i && t[2][0] == i) {
                return true;
            }
        }

        // No hay ganador
        return false;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.gui.agenda;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author m
 */
public class GuiAgenda {

/**
 * @param args the command line arguments
 */

public static ArrayList<NuevoContacto> contactos=new ArrayList<>();

public static void añadirDatos(String nombre, String telefono, String email){

NuevoContacto c=new NuevoContacto(nombre,telefono,email);	
contactos.add(c);

}
public static void main(String[] args) {
	
	MenuPrincipal m=new MenuPrincipal();
	m.setVisible(true);
}

}

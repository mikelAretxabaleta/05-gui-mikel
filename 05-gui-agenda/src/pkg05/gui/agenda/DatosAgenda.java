/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.gui.agenda;

import java.util.ArrayList;

/**
 *
 * @author m
 */
public class DatosAgenda {

private static ArrayList<Contacto> contactos=new ArrayList<>();

    public static ArrayList<Contacto> getContactos() {
        return contactos;
    }



public static void añadirContacto(Contacto c){
	
contactos.add(c);


}
	
}

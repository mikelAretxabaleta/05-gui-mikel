/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    
    private BaseDeDatos baseDeDatos;

	public Alumno(String nombre, String apellidos, String telefono, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}

	public Alumno() {
	}
	
	

	public void setBaseDeDatos(BaseDeDatos baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + '}';
	}
    
    
    
    
    
}

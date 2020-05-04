/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Matias
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private final int dni;

    public Cliente(String nombre, String apellido, int dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getDni() {
        return dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Ciudad: " + ciudad + ", Direccion: " + direccion + ", dni: " + dni + '}';
    }

    
}

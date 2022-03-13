/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_alumno;

/**
 *
 * @author lenin
 */
public class Alumno {
    String nombre;
    String apellido;
    String email;
    int carne;

    public Alumno(String nombre, String apellido, String email, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.carne = carne;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + ", email:" + email + ", carne:" + carne + '}';
    }

    public Alumno() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Registro_alumno;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    static Lista lista = new Lista();
    static Scanner sc = new Scanner(System.in);
    static Alumno alumno;
    public static void main(String[] args) {
        
        boolean salir = false;
        
        System.out.println("****TODOS LOS ELEMENTOS SERÁN AÑADIDOS AL FINAL DE LA LISTA****");
        while (!salir){
            
        JOptionPane.showMessageDialog(null, "Seleccione lo que desea hacer");
        String Eleccion = JOptionPane.showInputDialog(null, "1. Añadir un nuevo alumno \n2. Buscar un alumno"
                + "\n3. Eliminar un alumno\n4.Mostrar el listado de alumnos\n5.Salir");
        int eleccion = Integer.parseInt(Eleccion);
        
        switch(eleccion){
            case 1: añadir();
                JOptionPane.showMessageDialog(null, "Alumno Registrado");
                break;
            case 2: 
                String Carne = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea buscar");
                int CarneBusqueda = Integer.parseInt(Carne);
                lista.BuscarAlumno(CarneBusqueda);
                break; 
            case 3: 
                String Carne2 = JOptionPane.showInputDialog(null, "Ingrese el carné del alumno que desea eliminar");
                int CarneEliminar = Integer.parseInt(Carne2);
                lista.EliminarAlumno(CarneEliminar);
                break;
            case 4: lista.mostrarLista();
                break;
            case 5: salir = true;
                break;
            case 6: default: JOptionPane.showMessageDialog(null, "La opción que seleccionó no existe, seleccione otra");
                break;
        }
        }
  
    }
     public static void añadir(){
         String Nombre, Apellido, Email, Carnet;
         int Carne;
         
         Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
         Apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
         Email = JOptionPane.showInputDialog(null, "Ingrese el email");
         Carnet = JOptionPane.showInputDialog(null, "Ingrese el carné");
         Carne = Integer.parseInt(Carnet);
         lista.agregar(new Alumno(Nombre, Apellido, Email, Carne));
         
    }
}
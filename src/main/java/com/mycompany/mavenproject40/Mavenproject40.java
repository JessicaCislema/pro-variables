/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject40;

import javax.swing.JOptionPane;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject40 {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double notas []={10,9,7,6};
        double notas2 []={10,9,7,6,5,4};
        
        nombre= JOptionPane.showInputDialog("Ingresar nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        
        mensaje(nombre,edad);
        /*
        nombre= JOptionPane.showInputDialog("Ingresar nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        
        mensaje(nombre,edad);
        */
        JOptionPane.showMessageDialog(null,"El promedio es: " + promedio (notas));
        JOptionPane.showMessageDialog(null,"El SEGUNDO PROMEDIO ES: "+ promedio (notas2));
        
       // promedio(notas);
    }
    public static void mensaje(String nombres, int edades){
        JOptionPane.showMessageDialog(null,nombres + " tiene "+ edades + " anios ");
    }
    static double promedio (double []calificaciones){
            double  suma = 0;
            double respuesta;
            for (int i=0; i< calificaciones.length; i++){
                suma=suma+calificaciones[i];
            }
            respuesta = suma/calificaciones.length;
            
            return respuesta;
            
        }
    }

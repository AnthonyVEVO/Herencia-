/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.clases.Coordinador;
import ec.edu.espoch.herencia.clases.Estudiante;
import ec.edu.espoch.herencia.clases.Profesor;

/**
 *
 * @author SO-LAB-PC6
 */
public class Herencia {

    public static void main(String[] args) {

        Estudiante objEstudiante = new Estudiante("001", "Anthony", "Moreira", "2200336630", 20, "masculino");
     System.out.println(objEstudiante);
     
     
     
     Profesor objProfesor= new Profesor("555", "Ambiental", "Pedro", "Perez", "5525165125", 32, "Masculino");
        System.out.println(objProfesor);
        Coordinador objCoordinador = new Coordinador("651", "Sofware", "Coordinador academico", "Maria", "Pepe", "513610302", 90, "femenino");
        System.out.println(objCoordinador);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseEstudiante;

/**
 *
 * @author SALA I
 */
public class Estudiante {    
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Estudiante(){
        nombreEstudiante = "Juanito";
        calificacion1 = 5.00;
        calificacion2 = 2.00;
        calificacion3 = 3.00;
    }
    
    public Estudiante(String nEstudiante, double calif1, double calif2, double calif3){
        nombreEstudiante = nEstudiante;
        calificacion1 = calif1;
        calificacion2 = calif2;
        calificacion3 = calif3;
    }
    
    public void establecerNombreEstudiante(String name){
        nombreEstudiante = name;
    }
    
    public void establecerCalificacion1(double n){
        calificacion1 = n;
    }
    
    public void establecerCalificacion2(double n){
        calificacion2 = n;
    }
    
    public void establecerCalificacion3(double n){
        calificacion3 = n;
    }
    
    // public void establecerPromedio(double n){
    public void calcularPromedio(){
        promedio = (calificacion1+calificacion2+calificacion3)/3;
    }
    
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    
    public double obtenerCalificacion1(){
        return calificacion1;
    }
    
    public double obtenerCalificacion2(){
        return calificacion2;
    }
    
    public double obtenerCalificacion3(){
        return calificacion3;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    @Override
    public String toString(){
       String cadena = String.format("Los datos del Estudiante son:\n"
                        +" Nombre del estudiante: %s\n"
                        +" Calificacion 1: %.2f\n"
                        +" Calificacion 2: %.2f\n"
                        +" Calificacion 3: %.2f\n"
                        +" Promedio 2: %.2f\n",nombreEstudiante,
                        calificacion1,calificacion2,
                        calificacion3,promedio);
       return cadena;
    }
}

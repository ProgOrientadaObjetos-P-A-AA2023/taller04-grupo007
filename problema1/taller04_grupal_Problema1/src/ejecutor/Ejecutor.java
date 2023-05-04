/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;
import claseEstudiante.Estudiante;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
       Estudiante estudiante1 = new Estudiante();
       
       estudiante1.calcularPromedio();
       
       System.out.printf("%s\n", estudiante1);
       
       Estudiante estudiante2 = new Estudiante("Fernanda",9.00,8.50,8.00);
       
       estudiante2.calcularPromedio();
       
       System.out.printf("%s\n", estudiante2);
    }
    
}

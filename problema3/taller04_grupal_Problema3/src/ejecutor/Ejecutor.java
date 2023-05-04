/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;
import claseAutomotor.Automotor;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        Automotor vehiculo1 = new Automotor();
       
       vehiculo1.calcularValorMatricula();
       
       System.out.printf("%s\n", vehiculo1);
       
       Automotor vehiculo2 = new Automotor("1100005790","Datsun",1990,30000.50);
       
       vehiculo2.calcularValorMatricula();
       
       System.out.printf("%s\n", vehiculo2);
    }
    
}

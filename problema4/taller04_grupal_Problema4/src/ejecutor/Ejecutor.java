/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;
import claseCheques.Cheques;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        
       Cheques cheque1 = new Cheques();
       
       cheque1.calcularComision();
       
       System.out.printf("%s\n", cheque1);
       
       Cheques cheque2 = new Cheques("Martha","Banco de Loja",200.30);
       
       cheque2.calcularComision();
       
       System.out.printf("%s\n", cheque2);
    }
    
}

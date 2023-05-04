/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseCheques;

/**
 *
 * @author SALA I
 */
public class Cheques {
    
    private String cliente;
    private String banco;
    private double valorCheque;
    private double comision;
    
    public Cheques(){
        cliente = "Lucas";
        banco = "Banco del Pichincha";
        valorCheque = 15000.00;
    }
    
    public Cheques(String name, String b, double valor){
        cliente = name;
        banco = b;
        valorCheque = valor;
    }
    
    public void establecerCliente(String c){
        cliente = c;
    }
    
    public void establecerBanco(String m){
        banco = m;
    }
    
    public void establecerBanco(double n){
        valorCheque = n;
    }
    
    // public void establecerComision(double n){
    public void calcularComision(){
        comision = valorCheque*0.0003;
    }
    
    public String obtenercliente(){
        return cliente;
    }
    
    public String obtenerBanco(){
        return banco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    @Override
    public String toString(){
       String cadena = String.format("Los datos del Cheque son:\n"
                        +" Nombre del cliente: %s\n"
                        +" Banco: %s\n"
                        +" Valor del cheque: %.2f\n"
                        +" Comision: %.2f\n",cliente,
                        banco,
                        valorCheque,comision);
       return cadena;
    }
}

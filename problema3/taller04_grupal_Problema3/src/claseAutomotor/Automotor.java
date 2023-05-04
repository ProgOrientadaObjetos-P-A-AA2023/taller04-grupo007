/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseAutomotor;

/**
 *
 * @author SALA I
 */
public class Automotor {
    
    private String cedula;
    private String marcaV;
    private int anio;
    private double valorV;
    private double valorM;
    
    public Automotor(){
        cedula = "1150057501";
        marcaV = "Mitsubishi";
        anio = 2017;
        valorV = 15000.00;
    }
    
    public Automotor(String cd, String mV, int a, double precio){
        cedula = cd;
        marcaV = mV;
        anio = a;
        valorV = precio;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    
    public void establecerMarcaVehiculo(String m){
        marcaV = m;
    }
    
    public void establecerAnio(int n){
        anio = n;
    }
    
    public void establecerValorVehiculo(double n){
        valorV = n;
    }
    
    // public void establecerValorMatricula(double n){
    public void calcularValorMatricula(){
        valorM = (0.00002*valorV)*(2023-anio);
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerMarcaVehiculo(){
        return marcaV;
    }
    
    public int obtenerAnio(){
        return anio;
    }
    
    public double obtenerValorVehiculo(){
        return valorV;
    }
    
    public double obtenerValorMatricula(){
        return valorM;
    }
    
    @Override
    public String toString(){
       String cadena = String.format("Los datos del Automotor son:\n"
                        +" Cedula del propietario: %s\n"
                        +" Marca Vehiculo: %s\n"
                        +" Año de fabricacion: %d\n"
                        +" Valor del Vehiculo: %.2f\n"
                        +" Valor de la Matricula: %.2f\n",cedula,
                        marcaV,anio,
                        valorV,valorM);
       return cadena;
    }
    
}

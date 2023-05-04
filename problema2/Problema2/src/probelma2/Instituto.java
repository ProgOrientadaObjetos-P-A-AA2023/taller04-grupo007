package probelma2;

public class Instituto {

    private String nombre;
    private String apellido;
    private int sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Instituto(){
        nombre="Luis Fernando";
        apellido="Leon Tene";
        sueldoBasico=340;
        cedula="1950010312";
    }
    
    public  Instituto(String eNombre,String sApellido,int sBasico,String eCedula){
    nombre =eNombre;
    apellido= sApellido;
    sueldoBasico=sBasico;
    cedula= eCedula;
    
}
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerSueldoBasico(int n) {
        sueldoBasico = n;
    }

    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico * 0.2;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public int obtenerSuedoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }
    public String toString(){
      String cadena = String.format("Nombre %s\nApellido %s\nSueldoBasico %d\nSueldoTotal %.2f\nCedula %s\n",nombre,
                apellido,sueldoBasico,sueldoTotal,cedula);
        
       return cadena;
    }
}

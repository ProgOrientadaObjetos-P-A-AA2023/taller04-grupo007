
package ejecutor;

import probelma2.Instituto;

public class Ejecutor {

    public static void main(String[] args) {
        
        Instituto in= new Instituto();
      
        in.calcularSueldoTotal();
        
        System.out.printf(" %s\n",in);
        
        Instituto in2= new Instituto("Fernando","Leon Tene",350,"1950010315");
      
        in2.calcularSueldoTotal();
        
        System.out.printf(" %s\n",in2);
    
    
    }
    
}

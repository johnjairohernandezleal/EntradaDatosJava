
package entradadatos;
import java.io.*;


public class EntradaDatos {

    
    public static void main(String[] args) {
        
        String captura = null;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        try {
            System.out.println("Introduce el dato:");
            captura = bInput.readLine();
            
            while(captura!= null){
                System.out.println("Dato Introducido: " + captura);
                captura = bInput.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
}

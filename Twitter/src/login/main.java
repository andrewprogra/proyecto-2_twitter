 
package login;

import javax.swing.JFrame;
import login_ventana.ventana;

public class main extends JFrame {

     
    public static void main(String[] args) {
        
       ventana v1 =new ventana();//con un objeto llamamos a la ventana para tener un mejor orden
        
       v1.setVisible(true);//las ventanas son invisibles, este comadno es para hacerlas visibles
       v1.setLocationRelativeTo(null);//al ejecutarla nos aparesca en el centro 
        
   
    }
    
}

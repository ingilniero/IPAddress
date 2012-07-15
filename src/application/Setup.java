/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package application;
import javax.swing.JTextField;
/**
 *
 * @author GIL
 */
public class Setup {

    public void set(JTextField[] ip,JTextField cidr){
    //Generamos un valor en rango de los 255 que sea mayor a 10 para el primer
    //octeto de la ip
        int x = Utilities.random255();
        while(x<10){
            x = Utilities.random255();
        }
        ip[0].setText(String.valueOf(x));

        
        for(int i=1;i<ip.length;i++){
            ip[i].setText(String.valueOf(Utilities.random255()));
        }
//Agregamos un valor valido al CIDR
        cidr.setText(String.valueOf(Utilities.randomCIDR()));
    }
    public void solve(JTextField[] ip,JTextField cidr){

        
    }
}

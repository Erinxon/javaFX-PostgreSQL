/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

import javafx.application.Platform;
import javax.swing.JOptionPane;

/**
 *
 * @author Wil
 */
public class ControlesBasicos {
    
    public void salirSistema() {
        int pregunta = JOptionPane.showConfirmDialog(null, "Realmente desea salir del programa?");
        
        //Se cambio la variablen 'yes' (que no existia) por JOptionPane.YES_OPTION
        if (pregunta == JOptionPane.YES_OPTION) {
            Platform.exit();
        } 
    }
}
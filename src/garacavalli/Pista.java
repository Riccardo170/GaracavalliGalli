/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garacavalli;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Utente
 */
public class Pista extends JPanel {
    
    public void paint(Graphics ca){ // metodo per la creazione della pista, il campo verde e le linee bianche
        ca.setColor(Color.green);//creazione campo verde
        ca.fillRect(0, 0, 1000, 645);
        
        ca.setColor(Color.white);//creazione linee bianche della pista
        ca.fillRect(0, 0, 1000, 10);
        ca.fillRect(0, 100, 1000, 10);
        ca.fillRect(0, 200, 1000, 10);
        ca.fillRect(0, 300, 1000, 10);
        ca.fillRect(0, 400, 1000, 10);
        ca.fillRect(0, 500, 1000, 10);
        ca.fillRect(0, 600, 1000, 10);
        
        ca.fillRect(960, 0, 5, 645);
        ca.fillRect(960, 0, 5, 645);
        ca.fillRect(960, 0, 5, 645);
    }
}

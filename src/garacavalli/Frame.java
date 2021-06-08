/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garacavalli;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author informatica
 */
public class Frame extends JFrame{
    
    JPanel pannello = new JPanel();
    JFrame gara=new JFrame();
    JLabel j1=new JLabel("Selezionare il numero dei cavalli che devono correre");
    JButton C= new JButton("Conferma");
   
    JButton due=new JButton("2");
    JButton tre=new JButton("3");
    JButton quattro=new JButton("4");
    JButton cinque=new JButton("5");
    JButton sei=new JButton("6");
    JButton sette=new JButton("7");
    JButton otto=new JButton("8");
    JButton nove=new JButton("9");
    JButton dieci=new JButton("10");
    
    public Frame(){
        gara.setVisible(true);
        pannello.setLayout(null);
        gara.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pannello.setSize(600,400);
        gara.setSize(600,400);
        gara.setLocationRelativeTo(null);
        pannello.setBackground(Color.WHITE);
        pannello.setLayout(null);
        gara.add(pannello);
        
        C.setBounds(50,180, 100,40);
        due.setBounds(180,180, 100,40);
        tre.setBounds(50,180, 100,40);
        quattro.setBounds(180,180, 100,40);
        cinque.setBounds(50,180, 100,40);
        sei.setBounds(180,180, 100,40);
        sette.setBounds(50,180, 100,40);
        otto.setBounds(180,180, 100,40);
        nove.setBounds(50,180, 100,40);
        dieci.setBounds(180,180, 100,40);
        
        this.add(C);
        this.add(due);
        this.add(tre);
        this.add(quattro);
        this.add(cinque);
        this.add(sei);
        this.add(sette);
        this.add(otto);
        this.add(nove);
        this.add(dieci);
        
        C.addMouseListener(new AzioniMouse());
        due.addMouseListener(new AzioniMouse());
        tre.addMouseListener(new AzioniMouse());
        quattro.addMouseListener(new AzioniMouse());
        cinque.addMouseListener(new AzioniMouse());
        sei.addMouseListener(new AzioniMouse());
        sette.addMouseListener(new AzioniMouse());
        otto.addMouseListener(new AzioniMouse());
        nove.addMouseListener(new AzioniMouse());
        dieci.addMouseListener(new AzioniMouse());
    }
        public class AzioniMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
        }

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
           
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }

        
    
}
    
}

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
public class GaraCavalli extends JFrame {
    int posizione;
    Cavallo[]partecipanti;
    CavalliInGara[] thread_partecipanti;
    Pista pista;
    Graphics offscreen;
    Image buffer_virtuale;

    public GaraCavalli() {
        super("Gara Cavalli");
        setSize(1000,645);
        setLocation(10,40);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pista = new Pista();
        partecipanti = new Cavallo[6];
        thread_partecipanti= new CavalliInGara[6];
        posizione=1;
        
        int partenza = 15;
        for (int xx=0; xx<6; xx++){
            partecipanti[xx]=new Cavallo(partenza, xx+1);
            thread_partecipanti[xx]= new CavalliInGara(partecipanti[xx],this);
            partenza= partenza +100;
        }
        
        this.add(pista);
        setVisible(true);
    }
    
    public synchronized int getPosizione(){
        return posizione++;
    }
    
    public synchronized void controlloArrivi(){
        boolean arrivati = true;
        for ( int xx=0; xx<6; xx++){
            if(thread_partecipanti[xx].posizione==0){
                arrivati=false;
            }
        }
        if (arrivati){
            visualizzaClassifica();
        }
    }
    
    public void visualizzaClassifica(){ // metodo creazione e gestione classifica che stampa la posizione finale dei cavalli in base alla corsia 
        JLabel[] arrivi;
        arrivi = new JLabel[6];
        JFrame classifica= new JFrame("Classifica Finale");//nome assegnato alla finestra della classifica
        classifica.setSize(500,500); //dimensione classifica
        classifica.setLocation(280,180);//posizione classifica
        classifica.setBackground(Color.BLUE);
        classifica.setDefaultCloseOperation(EXIT_ON_CLOSE);//Interruzione della visione della classifica alla chiusura della finestra 
        classifica.getContentPane().setLayout(new GridLayout(6,1));
        
        for (int xx=1; xx<7; xx++){
            for (int yy=0; yy<6; yy++){
                if (thread_partecipanti[yy].posizione==xx){
                    arrivi[yy] = new JLabel (xx+" classificato cavallo in "+(yy+1)+" corsia");//ciò che la classifica stampa al termine della gara
                    arrivi[yy].setFont(new Font("Times New Roman",Font.ITALIC,20));//assegnazione dei font alle scritte della classifica
                    arrivi[yy].setForeground(Color.BLUE);
                    classifica.getContentPane().add(arrivi[yy]);                     
                }
            }
        }
        classifica.setVisible(true);
    }
    
    public void update(Graphics ca){
        paint(ca);
    }
    
    public void paint(Graphics ca){
        if (partecipanti !=null){
            Graphics2D screen = (Graphics2D)ca;
            buffer_virtuale= createImage(1000,645);
            offscreen = buffer_virtuale.getGraphics();
            Dimension d= getSize();
            pista.paint(offscreen);
            for(int xx=0;xx<6;xx++){
                partecipanti[xx].paint(offscreen);
            }
            screen.drawImage(buffer_virtuale, 0, 20, this);
            offscreen.dispose();
        }
    }
    
    public static void main(String[]a){
        GaraCavalli m = new GaraCavalli();
    }
    
}

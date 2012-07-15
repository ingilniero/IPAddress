/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;
import application.Setup;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
/**
 *
 * @author GIL
 */
public class interfaz extends JFrame {
    
    JPanel[] panel = new JPanel[5];
    int limit = 3;

    JLabel ipLabel = new JLabel("Dirección ip:");
    JLabel cidrLabel = new JLabel("Sufijo:");
    JLabel netLabel = new JLabel("Dirección de red:");
    JLabel maskLabel = new JLabel("Mascara de Subred:");

    JTextField[] ipField = new JTextField[4];
    JTextField cidrField = new JTextField(6);
    JTextField[] netField = new JTextField[4];
    JTextField[] maskField = new JTextField[4];

    JButton newIP = new JButton("Nueva ip");
    JButton clear = new JButton ("Limpiar");
    JButton customIP = new JButton ("Introducir ip");

    public interfaz(){
        super("Dirección ip");
        setSize(700,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //<editor-fold defaultstate="collapsed" desc="...Eventos de Teclado">
        for(int i=0;i<ipField.length;i++){
            final int x=i;
            ipField[i] = new JTextField(6);
            ipField[x].addKeyListener(new KeyListener() {
                public void keyTyped(KeyEvent e) {
                    if(ipField[x].getText().length() == limit)
                        e.consume();
                }
                public void keyPressed(KeyEvent e) {}
                public void keyReleased(KeyEvent e) {}
            });
        }

        cidrField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                if(cidrField.getText().length() == limit)
                        e.consume();
            }
            public void keyPressed(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}
        });

        for(int i=0;i<netField.length;i++){
            final int x=i;
            netField[i] = new JTextField(6);
            netField[x].addKeyListener(new KeyListener() {

                public void keyTyped(KeyEvent e) {
                    if(netField[x].getText().length() == limit)
                        e.consume();
                }
                public void keyPressed(KeyEvent e) {}
                public void keyReleased(KeyEvent e) {}
            });
        }
        for(int i=0;i<maskField.length;i++){
            final int x=i;
            maskField[i] = new JTextField(6);
            maskField[x].addKeyListener(new KeyListener() {

                public void keyTyped(KeyEvent e) {
                    if(maskField[x].getText().length() == limit)
                        e.consume();
                }
                public void keyPressed(KeyEvent e) {}
                public void keyReleased(KeyEvent e) {}
            });
        }
        //</editor-fold>

        newIP.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Setup s = new Setup();
                s.set(ipField,cidrField);
                for (int i=0;i<netField.length;i++){
                    netField[i].setForeground(Color.BLACK);
                }
                for (int i=0;i<maskField.length;i++){
                    maskField[i].setForeground(Color.BLACK);
                }
            }
        });

        GridLayout grid = new GridLayout(1,5);
        FlowLayout buttons = new FlowLayout(FlowLayout.CENTER);

        for (int i=0;i<panel.length;i++){
            panel[i] = new JPanel();
            panel[i].setLayout(grid);
        }
        
        panel[0].add(ipLabel);
        for(int i=0;i<ipField.length;i++){
            panel[0].add(ipField[i]);
            ipField[i].setHorizontalAlignment(JTextField.CENTER);
            ipField[i].setEditable(false);
        }

        panel[1].add(cidrLabel);
        panel[1].add(cidrField);
        cidrField.setHorizontalAlignment(JTextField.CENTER);
        cidrField.setEditable(false);

        panel[2].add(netLabel);
        for(int i=0;i<netField.length;i++){
            panel[2].add(netField[i]);
            netField[i].setHorizontalAlignment(JTextField.CENTER);
            
        }
        panel[3].add(maskLabel);
        for(int i=0;i<maskField.length;i++){
            panel[3].add(maskField[i]);
            netField[i].setHorizontalAlignment(JTextField.CENTER);
        }

        panel[4].setLayout(buttons);
        panel[4].add(newIP);
        panel[4].add(clear);
        panel[4].add(customIP);

        setLayout(new GridLayout(6,1));
        for (int i=0;i<panel.length;i++){
            add(panel[i]);
        }
        setVisible(true);
    }

public static void main(String[] args){
    new interfaz();
}






}

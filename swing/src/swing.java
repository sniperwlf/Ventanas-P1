/**
 * AWT Sample application
 *
 * @author 
 * @version 1.00 20/01/29
 */
import javax.swing.*;
import java.awt.color.*;
//import javax.swing.JFrame;
//import sun.swing.text.html.FrameEditorPaneTag;
import java.awt.*;//enables action listeners(clicks, buttons,keystrokes, etc)
import java.awt.event.*;
//import java.awt.Toolkit;
 
public class swing {
    
    public static void main(String[] args) {
        // Create application frame.
        JFrame frame = new JFrame("Practica1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes all windows and ends process by clicking the x button
        frame.setSize(400,200);
        //frame.getContentPane().setBackground(Color.DARK_GRAY );
        //frame.getContentPane().setForeground(Color.DARK_GRAY );
        
        //splits frame into panels
        JPanel panel = new JPanel(new GridBagLayout());//splits frame into a grid layout to position labels(text) using coordinates
        frame.getContentPane().add(panel, BorderLayout.NORTH);//sets layout starting position at north(other cardinal positions available)
        //frame.add(panel); adds panel to the frame
        GridBagConstraints c = new GridBagConstraints();
        //first frame
        JLabel label1 = new JLabel("Nombre: Pedro Alfonso Pacheco Garcia");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);//adds space in between lines 5 pixels wide
        panel.add(label1, c);
        JLabel label2 = new JLabel("Carrera: ISC");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label2, c);
        JLabel label3 = new JLabel("N. Control: 99999");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(label3, c);
        //button in first frame
        JButton button = new JButton("mensaje");//creates button
        c.gridx = 0;
        c.gridy = 3;
        panel.add(button, c);//adds button to our frame
        
      
        button.addActionListener(new Action());//adds action event function to our button
        
        frame.setVisible(true);
    }
    
    //separate class to implement action listener
     static class Action implements ActionListener{
        	//insert action in blackets to be performed on action
        	public void actionPerformed (ActionEvent a) {
        		JFrame frame2 = new JFrame("mensaje");
        		frame2.setVisible(true);
        		frame2.setSize(250,150);
        		JPanel panel = new JPanel(new GridBagLayout());
        frame2.getContentPane().add(panel, BorderLayout.NORTH);
        GridBagConstraints c = new GridBagConstraints();
        JLabel label1 = new JLabel("Direccion:101 Curry Trail Dr");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);//adds space in between lines 5 pixels wide
        panel.add(label1, c);
        JLabel label2 = new JLabel("Telefono:(534)-243-2432");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label2, c);
        JLabel label3 = new JLabel("Genero: Rock Alternativo");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(label3, c);
        		
        	}
        	
        	
        }
}


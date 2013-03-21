/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockforecast;


import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class HomePage extends JApplet{

    @Override
    public void init() 
    {
        setSize(1348,650);
        
        JTabbedPane jtp = new JTabbedPane();
        JScrollPane jsp = null;
        
        jtp.add("Home",new HomePanel());
        
        Container c = getContentPane();
        try {
            jsp = new JScrollPane(new TutorialPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            jtp.add("Tutorial",c.add(jsp));
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        jtp.add("ContactUs",new Contact_Us());
        
        getContentPane().add(jtp);
    
    }   
}

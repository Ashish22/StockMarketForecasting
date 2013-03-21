/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockforecast;

import javax.swing.*;
import java.awt.*;

class Contact_Us extends JPanel {
    JLabel label1,label2,label3;
    
    public Contact_Us()
    {
        Color c = new Color(165,214,223);
        setBackground(c);
        setForeground(Color.red);
        
        setLayout(new GridLayout(1,3));
        
        label1 = new JLabel("<html><h1>Vinay Kumar - IIT2009168</h1><hr>IIIT Allahabad</hr><hr>email id: iit2009168@iiita.ac.in</hr><hr>Mob No. : </hr><hr></html>");
        label1.setFont(new Font("Serrif",Font.PLAIN,15));
        add(label1,BorderLayout.WEST);
        
        label2 = new JLabel("<html><h1>Vinay Saini - IIT2009074</h1><hr>IIIT Allahabad</hr><hr>email id: iit2009074@iiita.ac.in</hr><hr>Mob No. : </hr><hr></html>") ;
        label2.setFont(new Font("Serrif",Font.PLAIN,15));
        add(label2,BorderLayout.WEST);
        
        label3 = new JLabel("<html><h1>Vikash Gupta - IIT2009088</h1><hr>IIIT Allahabad</hr><hr>email id: iit2009088@iiita.ac.in</hr><hr>Mob No. : +919026613728</hr><hr></html>") ;
        label3.setFont(new Font("Serrif",Font.PLAIN,15));
        add(label3,BorderLayout.WEST);

    }
}

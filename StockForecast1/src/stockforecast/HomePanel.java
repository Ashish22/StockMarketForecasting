/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockforecast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class HomePanel extends JPanel implements ActionListener {
    
    JLabel label,label1;
    JButton btnRun;
    public HomePanel()
    {
        setLayout(new GridLayout(3,1));
        
        Color c = new Color(165,214,223);
        setBackground(c);
        
        JPanel panel = new JPanel();
        panel.setBackground(c);
        panel.setLayout(new GridBagLayout());
        //panel.setPreferredSize(new Dimension(800,900));
        GridBagConstraints gbCons = new GridBagConstraints();
        
        gbCons.gridx=1;
        gbCons.gridy=1;
        label = new JLabel();
        label.setText("Forecasting of Stock Market");
        label.setForeground(Color.red);
        label.setFont(new Font("Serif",Font.BOLD,36));
        panel.add(label,gbCons);
        this.add(panel,BorderLayout.NORTH);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(c);
        label1 = new JLabel();
        label1.setText("Using Backpropagation Learning in Neural Network");
        label1.setForeground(Color.red);
        label1.setFont(new Font("Serif",Font.BOLD,30));
        panel2.add(label1);
        this.add(panel2,BorderLayout.NORTH);
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(c);
        //panel1.setLayout(new GridBagLayout());
        btnRun = new JButton("       RUN         ");
        panel1.add(btnRun);
        btnRun.addActionListener(this);
        //panel1.setPreferredSize(new Dimension(10,200));
        this.add(panel1,BorderLayout.CENTER);
        
        
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        
        if(btn.equals(btnRun)) {
            //new InputFrame();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new UserInterface().setVisible(true);
                }
            });
        }
    }
    
}

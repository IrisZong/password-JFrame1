

import javax.swing.*;



public class swing {
    public static void main(String args[]) {
    
        JFrame f=new JFrame("clicky");
    

       JButton b=new JButton("Its A Button!");
        b.setBounds(100,50,150, 40);

        f.add(b);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }

}

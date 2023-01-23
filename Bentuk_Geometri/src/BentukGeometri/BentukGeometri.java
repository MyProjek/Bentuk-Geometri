
package BentukGeometri;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.HashSet;
import javax.swing.*;

/**
 * Nama     : Mochammad Toyib
 * NIM      : 2121400015
 * Kelas    : C
 */

public class BentukGeometri  extends JPanel{
    // Membuat Lingkaran
    public void lingkaran(Graphics g){
        Graphics2D ling = (Graphics2D) g;
        Ellipse2D lingkaran;
        double x = 250, y = 100;
        double diameter = 80;
        lingkaran = new Ellipse2D.Double(x, y, diameter, diameter);
        ling.setColor(Color.blue);
        ling.fill(lingkaran);
    }
    
    // Membaut Perssegi
    public void persegi(Graphics g) {
        Graphics2D kot = (Graphics2D) g;
        int x = 500, y = 100;
        int p = 100, l = 100;
        kot.setColor(Color.yellow);
        kot.fill(new Rectangle(x, y, p, l));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        clear(g);
        lingkaran(g);
        persegi(g);
    }
    
    protected void clear(Graphics g){
        super.paintComponent(g);
    }
    
    public static void main(String[] args){
        BentukGeometri panelGambar = new BentukGeometri();
        JFrame fr = new JFrame();
        fr.setTitle("Bentuk Lingkaran & Kotak dibuat oleh Mochammad Toyib");
        fr.setSize(720,460);
        fr.getContentPane().add(panelGambar);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}

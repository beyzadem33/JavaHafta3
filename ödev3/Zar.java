package ödev3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Zar extends JFrame {

    private JLabel zar1, zar2;
    private JButton atButonu;
    private Random rand;
	private String path ="D:\\eclipse ýde\\ödev3\\src\\ödev3\\"; 

    private int imageWidth = 100;
    private int imageHeight = 100;

    public Zar() {
        super("Zar at");
        rand = new Random();
        
        
        zar1 = new JLabel(resizeImage(new ImageIcon(path + "2.png")));
        zar2 = new JLabel(resizeImage(new ImageIcon(path + "2.png")));

        atButonu = new JButton("At");
        atButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });

        setLayout(new FlowLayout());
        add(zar1);
        add(zar2);
        add(atButonu);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    private void rollDice() {
        int sayi1 = rand.nextInt(6) + 1;
        int sayi2 = rand.nextInt(6) + 1;
        
        zar1.setIcon(resizeImage(new ImageIcon(path + sayi1 + ".png")));
        zar2.setIcon(resizeImage(new ImageIcon(path + sayi2 + ".png")));
    }

    private ImageIcon resizeImage(ImageIcon icon) {
        Image image = icon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static void main(String[] args) {
        new Zar();
    }
}
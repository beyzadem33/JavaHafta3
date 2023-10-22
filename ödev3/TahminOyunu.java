package �dev3;

import javax.swing.JOptionPane;
import java.util.Random;

public class TahminOyunu {

    public static void main(String[] args) {
        Random random = new Random();

        int rastgeleSayi = random.nextInt(100) + 1;
        int tahmin;

        JOptionPane.showMessageDialog(null, "1 ile 100 aras�nda bir say� tuttum. Say�y� bulmaya �al��");

        do {
            String tahminStr = JOptionPane.showInputDialog("Tahmininizi girin: ");
            tahmin = Integer.parseInt(tahminStr);

            if (tahmin < rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha b�y�k bir say� girin.");
            } else if (tahmin > rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha k���k bir say� girin.");
            } else {
                JOptionPane.showMessageDialog(null, "Tebrikler do�ru tahmin ettiniz!");
            }
        } while (tahmin != rastgeleSayi);
    }
}

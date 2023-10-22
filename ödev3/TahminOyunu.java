package ödev3;

import javax.swing.JOptionPane;
import java.util.Random;

public class TahminOyunu {

    public static void main(String[] args) {
        Random random = new Random();

        int rastgeleSayi = random.nextInt(100) + 1;
        int tahmin;

        JOptionPane.showMessageDialog(null, "1 ile 100 arasýnda bir sayý tuttum. Sayýyý bulmaya çalýþ");

        do {
            String tahminStr = JOptionPane.showInputDialog("Tahmininizi girin: ");
            tahmin = Integer.parseInt(tahminStr);

            if (tahmin < rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha büyük bir sayý girin.");
            } else if (tahmin > rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha küçük bir sayý girin.");
            } else {
                JOptionPane.showMessageDialog(null, "Tebrikler doðru tahmin ettiniz!");
            }
        } while (tahmin != rastgeleSayi);
    }
}

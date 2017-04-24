
package ogrencibilgisistemi;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Giris extends JFrame {
    JLabel isim ,soyisim ,sifre ,ogrencino;
    public Giris(){
        super("Öğrenci Profili");
        this.setSize(500, 500);
        setLayout(null);
        
       
        isim = new JLabel("İsim: "+OgrenciBilgiSistemi.Pisim);
        isim.setBounds(160, 100, 200, 30);
        this.add(isim);
        
        soyisim = new JLabel("Soyisim: "+OgrenciBilgiSistemi.Psoyisim);
        soyisim.setBounds(160, 130, 200, 30);
        this.add(soyisim);
        
        sifre = new JLabel("Şifre: "+OgrenciBilgiSistemi.Psifre);
        sifre.setBounds(160, 160, 200, 30);
        this.add(sifre);
        
        ogrencino = new JLabel("Öğrenci No: "+OgrenciBilgiSistemi.Pogrencino);
        ogrencino.setBounds(160, 190, 200, 30);
        this.add(ogrencino);
        
        this.setVisible(true);
        
    }
    public static void main(String args[]){
        Giris no1 = new Giris();
    }
    
}

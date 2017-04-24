
package ogrencibilgisistemi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AnaEkran extends JFrame implements ActionListener {
   
   
    
    
 public static JButton Giris , YeniKayit ;
 public static JTextField Adin , Sifren;
 public static JLabel Adi , Sifre , GirisYapilamadi;
    
    
    public AnaEkran(){
        super("Öğrenci Giriş Sistemi");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocation(500, 100);
        
        Adi = new JLabel("Adınız:");
        Adi.setBounds(150, 100, 50, 50);
        this.add(Adi);
        
        Sifre = new JLabel("Şifreniz:");
        Sifre.setBounds(150, 135, 55, 50);
        this.add(Sifre);
        
        Adin = new JTextField();
        Adin.setBounds(200, 110, 100, 30);
        this.add(Adin);
        
        Sifren = new JTextField();
        Sifren.setBounds(200, 145, 100, 30);
        this.add(Sifren);
        
        Giris = new JButton("Giriş");
        Giris.setBounds(200, 180, 70, 40);
        Giris.setActionCommand("Giris");
        Giris.addActionListener(this);
        this.add(Giris);
        
        YeniKayit = new JButton("Yeni Kayıt");
        YeniKayit.setBounds(280, 180, 80, 40);
        YeniKayit.setActionCommand("Kayit");
        YeniKayit.addActionListener(this);
        this.add(YeniKayit);
        
        GirisYapilamadi = new JLabel();
        GirisYapilamadi.setBounds(140, 250, 250, 40);
        this.add(GirisYapilamadi);
        
        
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Kayit"){
            KayitEkrani no1 = new KayitEkrani();
            
        } if(e.getActionCommand()=="Giris"){
            OgrenciBilgiSistemi.liste();
            OgrenciBilgiSistemi.Kontrol();
        }
        
    }
    
     
   
}

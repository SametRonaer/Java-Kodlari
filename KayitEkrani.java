
package ogrencibilgisistemi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class KayitEkrani extends JFrame implements ActionListener {
    
    JLabel isim , soyisim , sifre , ogrencino;
    JButton kayit , iptal;
    JTextField Tisim ,Tsoyisim , Tsifre , Togrencino;
    String sql , Sisim ,Ssifre , Ssoyisim , Sogrencino , Values;
    
    public void KayitAl(){
        
        Sisim = "'"+Tisim.getText()+"'"+",";
        Ssoyisim = "'"+Tsoyisim.getText()+"'"+",";
        Ssifre = "'"+Tsifre.getText()+"'"+",";
        Sogrencino = "'"+Togrencino.getText()+"'";
        Values = "(" +Sisim +Ssoyisim+Ssifre +Sogrencino +")" ;
        
        sql = "insert into  ogrenciler (isim , soyisim , sifre ,ogrencino) values"+Values; 
        
       OgrenciBilgiSistemi.Kaydet(sql);
       
        
    }
    
    
    public KayitEkrani(){
        super("Kayit Ekleme");
        this.setSize(500, 500);
        setLayout(null);
        this.setLocation(450, 100);
        
        isim = new JLabel("İsim:");
        isim.setBounds(153, 100, 50, 30);
        this.add(isim);
        
        soyisim = new JLabel("Soyisim:");
        soyisim.setBounds(140, 130, 70, 30);
        this.add(soyisim);
        
        sifre = new JLabel("Şifre:");
        sifre.setBounds(160, 160, 70, 30);
        this.add(sifre);
        
        ogrencino = new JLabel("Öğrenci No:");
        ogrencino.setBounds(120, 190, 100, 30);
        this.add(ogrencino);
        
        Tisim = new JTextField();
        Tisim.setBounds(200, 100, 100, 30);
        this.add(Tisim);
        
         
        Tsoyisim = new JTextField();
        Tsoyisim.setBounds(200, 130, 100, 30);
        this.add(Tsoyisim);
        
         
        Tsifre = new JTextField();
        Tsifre.setBounds(200, 160, 100, 30);
        this.add(Tsifre);
        
         
        Togrencino = new JTextField();
        Togrencino.setBounds(200, 190, 100, 30);
        this.add(Togrencino);
        
        
        kayit = new JButton("Kayıt");
        kayit.setBounds(150, 280, 90, 40);
        kayit.setActionCommand("kayit");
        kayit.addActionListener(this);
        this.add(kayit);
        
        
        
        iptal = new JButton("İptal");
        iptal.setBounds(280, 280, 90, 40);
        iptal.setActionCommand("iptal");
        iptal.addActionListener(this);
        this.add(iptal);
        OgrenciBilgiSistemi.liste();
        
        this.setVisible(true);
    }
    
    
    public static void main(String args []){
        KayitEkrani k = new KayitEkrani();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()== "iptal"){
            System.exit(0);

        }if (e.getActionCommand()== "kayit"){
           KayitAl();
            
        }
      
    }
}

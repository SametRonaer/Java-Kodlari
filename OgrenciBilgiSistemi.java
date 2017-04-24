
package ogrencibilgisistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class OgrenciBilgiSistemi {

   private static  AnaEkran a;
   private static Connection con ;
   private static String VTuser = "Ogrenci";
   private static String VTsifre = "123";
   private static String VTurl = "jdbc:derby://localhost:1527/OgrenciKayitSistemi";
   private static  PreparedStatement pst;
   private static String isim , sifre , isim2 , sifre2 ;
   public static String Pisim , Psifre , Psoyisim ,Pogrencino;
   

    
    public static void main(String[] args) {
         a = new AnaEkran();
        
    }
    
    
    
 public static Connection baglan(){
        try{
        
     Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance(); // Connector yüklendi
      con = DriverManager.getConnection(VTurl,VTuser , VTsifre); // bağlanma adresi ve şifresini nensnemize verdik
       System.out.println("Bağlandı");
      
     }catch(Exception e){
   System.out.println( e.toString()+ " Bağlanamadı");
 }
     return con;
 }

  public static void liste(){
     if(con== null){
         System.out.println("veritabanına bağlı değil");
         baglan();
     }
     
     }
    
     
     
     
     
 
 
    public static void Kaydet(String x ){
 try{      
  PreparedStatement pst = con.prepareStatement(x);
  System.out.println(pst.executeUpdate());

 }catch(Exception e){
     System.out.println("Kayıt alınamadı :"+ e.toString());
 }
        
        
 }
  
  
    
    public static void Kontrol(){
     isim = AnaEkran.Adin.getText();   //AnaEkran.Adin.getText();
     sifre =AnaEkran.Sifren.getText();
    
     
      try{
     Statement stmt = con.createStatement();
     ResultSet rs = stmt.executeQuery(" SELECT * from ogrenciler  "); // Sonuc alma işlemi
     
     
       while(rs.next()){
          
           isim2 = rs.getString(1);
           sifre2 = rs.getString(3);
           
           
          if(isim.equals(isim2)&&sifre.equals(sifre2)){
              System.out.println("Giriş Yapıldı");
              
              Pisim = rs.getString(1);
              Psoyisim = rs.getString(2);
              Psifre = rs.getString(3);
              Pogrencino = rs.getString(4);
              
              Giris no1 = new Giris();
             
              
          }else{
              AnaEkran.GirisYapilamadi.setText("Giriş Yapılamadı Tekrar Deneyiniz");
               
              
          }
      
     }
    
     //System.out.println(isim2.codePoints());
     }catch (Exception e){
       System.out.println( e.toString()+" Bir sorun oluştu");
     }
     
     
    }
    
    
    
    

}

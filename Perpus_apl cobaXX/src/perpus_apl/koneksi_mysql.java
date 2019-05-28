package perpus_apl;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KANIA
 */
public class koneksi_mysql {
    Connection koneksi;
    public Connection getConnection(){
    try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpus","root","");
            } catch (Exception e){
               JOptionPane.showMessageDialog(null,"Maaf Data Yang Anda Masukkan Salah","Informasi",JOptionPane.INFORMATION_MESSAGE);
           }
    return koneksi;
}
}

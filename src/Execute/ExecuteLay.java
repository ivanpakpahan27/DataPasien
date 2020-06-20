package Execute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entitas.Layanan;
import Database.ConnectionManager;
/**
 *
 * @author Ivan Pakpahan
 */
public class ExecuteLay {
    public List<Layanan> getLay(){
        List<Layanan> listLay = new ArrayList<>();
        String query = "select * from layanan";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Layanan lay = new Layanan();
                lay.setId_Layanan(rs.getString("Id_Layanan"));
                lay.setId_Admin(rs.getString("Id_Admin"));
                lay.setId_Pasien(rs.getString("Id_Pasien"));
                lay.setId_Dokter(rs.getString("Id_Dokter"));
                listLay.add(lay);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDok.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listLay;
    }
    public int insertLay(Layanan lay){
        int hasil = 0;
        String query = "Insert into layanan(Id_Layanan,Id_Admin,Id_Pasien,Id_Dokter)" + "value('"+ lay.getId_Layanan()+"','"+lay.getId_Admin()+"','"+lay.getId_Pasien()+"','"+lay.getId_Dokter()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteLay.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    public int deleteLay(String delId_Layanan){
        int hasil = 0;
        String query = "delete from layanan where Id_Layanan='"+ delId_Layanan+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteLay.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    public int updateLay(Layanan newLay){
        int hasil = 0;
        String query = "update layanan set Id_Admin='"+newLay.getId_Admin()+"',Id_Pasien='"+newLay.getId_Pasien()+"',Id_Pasien='"+newLay.getId_Dokter()+" where Id_Layanan ='"+newLay.getId_Layanan()+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteLay.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}

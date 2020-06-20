package Execute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entitas.Admin;
import Database.ConnectionManager;
/**
 *
 * @author Ivan Pakpahan
 */
public class ExecuteAdm {
    public List<Admin> getAdm(){
        List<Admin> listAdm = new ArrayList<>();
        String query = "select * from admin";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId_Admin(rs.getString("Id_Admin"));
                adm.setNama(rs.getString("Nama"));
                adm.setNo_Hp(rs.getString("No_Hp"));
                adm.setAlamat(rs.getString("Alamat"));
                listAdm.add(adm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listAdm;
    }
    public int insertAdm(Admin adm){
        int hasil = 0;
        String query = "Insert into admin(Id_Admin,Nama,No_Hp,Alamat)" + "value('"+ adm.getId_Admin()+"','"+adm.getNama()+"','"+adm.getNo_Hp()+"','"+adm.getAlamat()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    public int deleteAdm(String delId_Admin){
        int hasil = 0;
        String query = "delete from admin where Id_Admin='"+ delId_Admin+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    public int updateAdm(Admin newAdm){
        int hasil = 0;
        String query = "update admin set Nama='"+newAdm.getNama()+"',alamat='"+newAdm.getAlamat() +"',No_Hp='"+newAdm.getNo_Hp()+" where Id_Pasien ='"+newAdm.getId_Admin()+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}

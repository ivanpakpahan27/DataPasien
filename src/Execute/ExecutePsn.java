package Execute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entitas.Pasien;
import Database.ConnectionManager;

/**
 *
 * @author Ivan Pakpahan
 */
public class ExecutePsn {
    public List<Pasien> getPas(){
        List<Pasien> listPas = new ArrayList<>();
        String query = "select * from pasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Pasien pas = new Pasien();
                pas.setId_Pasien(rs.getString("Id_Pasien"));
                pas.setNama(rs.getString("Nama"));
                pas.setUmur(rs.getInt("Umur"));// umur tipenya integer
                pas.setAlamat(rs.getString("Alamat"));
                pas.setStatus(rs.getString("Status"));
                listPas.add(pas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPas;
    }
    public int insertPas(Pasien pas){
        int hasil = 0;
        String query = "Insert into pasien(Id_Pasien,Nama,Umur,Alamat,Status)" + "value('"+ pas.getId_Pasien()+"','"+pas.getNama()+"',"+pas.getUmur()+",'"+pas.getAlamat()+"','"+pas.getStatus()+"')";
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
    public int deletePas(String delId_Pasien){
        int hasil = 0;
        String query = "delete from pasien where Id_Pasien='"+ delId_Pasien+"'";
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
    public int updatePas(Pasien newPas){
        int hasil = 0;
        String query = "update pasien set Nama='"+newPas.getNama()+"',alamat='"+newPas.getAlamat() +"',status='"+newPas.getStatus()+"', umur = "+ newPas.getUmur()+" where Id_Pasien ='"+newPas.getId_Pasien()+"'";
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


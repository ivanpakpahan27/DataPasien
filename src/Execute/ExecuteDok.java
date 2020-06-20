package Execute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entitas.Dokter;
import Database.ConnectionManager;
/**
 *
 * @author Ivan Pakpahan
 */
public class ExecuteDok {
    public List<Dokter> getDok(){
        List<Dokter> listPas = new ArrayList<>();
        String query = "select * from dokter";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Dokter dok = new Dokter();
                dok.setId_Dokter(rs.getString("Id_Pasien"));
                dok.setNama(rs.getString("Nama"));
                dok.setSpesialis(rs.getString("Spesialis"));
                dok.setUmur(rs.getInt("Umur"));
                dok.setAlamat(rs.getString("Alamat"));
                listPas.add(dok);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPas;
    }
    public int insertDok(Dokter dok){
        int hasil = 0;
        String query = "Insert into dokter(Id_Dokter,Nama,Spesialis,Umur,Alamat)" + "value('"+ dok.getId_Dokter()+"','"+dok.getNama()+"','"+dok.getSpesialis()+"',"+dok.getUmur()+",'"+dok.getAlamat()+"')";
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
    public int deleteDok(String delId_Dokter){
        int hasil = 0;
        String query = "delete from dokter where Id_Dokter='"+ delId_Dokter+"'";
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
    public int updateDok(Dokter newDok){
        int hasil = 0;
        String query = "update dokter set Nama='"+newDok.getNama()+"',alamat='"+newDok.getAlamat() +"',spesialis='"+newDok.getSpesialis()+"', umur = "+ newDok.getUmur()+" where Id_Pasien ='"+newDok.getId_Dokter()+"'";
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
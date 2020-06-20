package Entitas;
/**
 *
 * @author Ivan Pakpahan
 */
public class Layanan {
    private String Id_Layanan;
    private String Id_Admin;
    private String Id_Pasien;
    private String Id_Dokter;
    public Layanan() {
    }
    public Layanan(String Id_Layanan, String Id_Admin, String Id_Pasien, String Id_Dokter) {
        this.Id_Layanan = Id_Layanan;
        this.Id_Admin = Id_Admin;
        this.Id_Pasien = Id_Pasien;
        this.Id_Dokter = Id_Dokter;
    }
    public String getId_Layanan() {
        return Id_Layanan;
    }
    public void setId_Layanan(String Id_Layanan) {
        this.Id_Layanan = Id_Layanan;
    }
    public String getId_Admin() {
        return Id_Admin;
    }
    public void setId_Admin(String Id_Admin) {
        this.Id_Admin = Id_Admin;
    }
    public String getId_Pasien() {
        return Id_Pasien;
    }
    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }
    public String getId_Dokter() {
        return Id_Dokter;
    }
    public void setId_Dokter(String Id_Dokter) {
        this.Id_Dokter = Id_Dokter;
    }
    @Override
    public String toString() {
        return "Layanan{" + "Id Pelayanan = " + Id_Layanan +"\t"+"\t"+", Id Admin = " + Id_Admin+"\t"+"\t"+ ", Id Pasien = " + Id_Pasien+"\t"+"\t" + ", Id Dokter = " + Id_Dokter + '}';
    }    
}

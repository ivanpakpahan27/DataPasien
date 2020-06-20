package Entitas;
/**
 *
 * @author Ivan Pakpahan
 */
public class Admin {
    private String Id_Admin;
    private String Nama;
    private String No_Hp;
    private String Alamat;
    public Admin() {
    }
    public Admin(String Id_Admin, String Nama, String No_Hp, String Alamat) {
        this.Id_Admin = Id_Admin;
        this.Nama = Nama;
        this.No_Hp = No_Hp;
        this.Alamat = Alamat;
    }
    public String getId_Admin() {
        return Id_Admin;
    }
    public void setId_Admin(String Id_Admin) {
        this.Id_Admin = Id_Admin;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getNo_Hp() {
        return No_Hp;
    }
    public void setNo_Hp(String No_Hp) {
        this.No_Hp = No_Hp;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    @Override
    public String toString() {
        return "Admin{" + "Id_Admin = " + Id_Admin+"\t"+"\t" + ", Nama = " + Nama+"\t"+"\t" + ", No_Hp = " + No_Hp+"\t"+"\t" + ", Alamat = " + Alamat + '}';
    }
}

package Entitas;
/**
 *
 * @author Ivan Pakpahan
 */
public class Dokter {
    private String Id_Dokter;
    private String Nama;
    private String Spesialis;
    private int Umur;
    private String Alamat;

    public Dokter() {
    }
    public Dokter(String Id_Dokter, String Nama, String Spesialis, int Umur, String Alamat) {
        this.Id_Dokter = Id_Dokter;
        this.Nama = Nama;
        this.Spesialis = Spesialis;
        this.Umur = Umur;
        this.Alamat = Alamat;
    }
    public String getId_Dokter() {
        return Id_Dokter;
    }
    public void setId_Dokter(String Id_Dokter) {
        this.Id_Dokter = Id_Dokter;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getSpesialis() {
        return Spesialis;
    }
    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public int getUmur() {
        return Umur;
    }
    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    @Override
    public String toString() {
        return "Dokter{" + "Id_Dokter = " + Id_Dokter + ", Nama = " + Nama + ", Spesialis = " + Spesialis + ", Umur = " + Umur + ", Alamat = " + Alamat + '}';
    }
    
    
}

package Entitas;
/**
 *
 * @author Ivan Pakpahan
 */
public class Pasien {
    private String Id_Pasien;
    private String Nama;
    private int Umur;
    private String Alamat;
    private String Status;
    public Pasien() {
    }
    
    public Pasien(String Id_Pasien, String Nama, int Umur, String Alamat,String Status) {
        this.Id_Pasien = Id_Pasien;
        this.Nama = Nama;
        this.Umur = Umur;
        this.Alamat = Alamat;
        this.Status = Status;
    }

    public String getId_Pasien() {
        return Id_Pasien;
    }
    public void setId_Pasien(String Id_Pasien) {
        this.Id_Pasien = Id_Pasien;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
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
    public String getStatus() {
        return Status;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
    @Override
    public String toString() {
        return "Pasien{" + "Id_Pasien = " + Id_Pasien+"\t"+"\t" + ",Nama = " + Nama +"\t"+"\t"+ ", Umur = " + Umur + " tahun"+"\t"+"\t"+", Alamat = " + Alamat +"\t"+"\t"+", Status = " + Status + '}';
    }
}

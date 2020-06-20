package Execute;
import java.util.List;
import java.util.Scanner;
import Entitas.Pasien;
import Entitas.Dokter;
import Entitas.Admin;
import Entitas.Layanan;
/**
 *
 * @author Ivan Pakpahan
 */
public class ExecuteData {
    private static boolean KELUAR = false;
    private static ExecutePsn execPsn;
    private static ExecuteDok execDok;
    private static ExecuteAdm execAdm;
    private static ExecuteLay execLay;
    public static void main(String[] args) {
        execPsn = new ExecutePsn();
        execDok = new ExecuteDok();
        execAdm = new ExecuteAdm();
        execLay = new ExecuteLay();
        String Id_Pasien, Nama, Alamat,Id_Dokter,Spesialis,Status,Bantu,No_Hp,Id_Admin,Id_Layanan;
        int Umur;
        while(!KELUAR){
            System.out.println("**********************************************");
            System.out.println("PENTING UNTUK MENAMPILKAN DATA TERLEBIH DAHULU");
            System.out.println("-------UNTUK MENGECEK KETERSEDIAAN DATA-------");
            System.out.println("-----------------------------------------------");
            System.out.println("*1.  Tampil data pasien  ");
            System.out.println("*2.  Input data pasien  ");
            System.out.println("*3.  Ubah data pasien  ");
            System.out.println("*4.  Hapus data pasien ");
            System.out.println("*5.  Tampil data dokter ");
            System.out.println("*6.  Input data dokter ");
            System.out.println("*7.  Ubah data dokter ");
            System.out.println("*8.  Hapus data dokter ");
            System.out.println("*9.  Tampil data admin ");
            System.out.println("*10. Input data admin ");
            System.out.println("*11. Ubah data admin ");
            System.out.println("*12. Hapus data admin ");
            System.out.println("*13. Tampil data layanan ");
            System.out.println("*14. Input data layanan ");
            System.out.println("*15. Ubah data layanan ");
            System.out.println("*16. Hapus data layanan ");
            System.out.println("*17. Keluar Aplikasi ");
            System.out.println("**********************************************");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pilihan Anda : ");
            int pilih = scanner.nextInt();
            switch(pilih){
                case 1 :{
                    System.out.println("Anda memilih Tampil Data Pasien ");
                    List<Pasien> listPas = execPsn.getPas();
                    System.out.println("===========================================");
                    for(Pasien pas : listPas){
                        System.out.println(pas.toString());      
                    }
                    System.out.println("===========================================");
                    break;
                }
                case 2 :{
                    System.out.println("Anda memilih Input Data Pasien baru ");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Pasien    : ");
                    Id_Pasien = scanner.nextLine();
                    System.out.print("Masukkan Nama         : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat       : ");
                    Alamat = scanner.nextLine();
                    System.out.print("Masukkan Umur         : ");
                    Umur = scanner.nextInt();
                    System.out.print("");
                    Bantu = scanner.nextLine();
                    System.out.print("Masukkan Status       : ");
                    Status = scanner.nextLine();
                    Pasien newPas = new Pasien(Id_Pasien, Nama, Umur, Alamat, Status);
                    int hasil = execPsn.insertPas(newPas);
                    System.out.println("Data tersimpan = " + hasil);
                    break;
                }
                case 3 :{
                    System.out.println("Anda memilih Ubah data Pasien");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Pasien yang akan diubah : ");
                    Id_Pasien = scanner.nextLine();
                    System.out.print("Masukkan nama baru                  : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan alamat baru                : ");
                    Alamat = scanner.nextLine();
                    System.out.print("Masukkan umur baru                  :");
                    Umur = scanner.nextInt();
                    System.out.print("");
                    Bantu = scanner.nextLine();
                    System.out.print("Masukkan status baru                : ");
                    Status = scanner.nextLine();
                    Pasien newPas = new Pasien(Id_Pasien, Nama, Umur, Alamat, Status);
                    int hasil = execPsn.updatePas(newPas);
                    System.out.println("Data diubah = "+ hasil);
                    break;
                }
                case 4 :{
                    System.out.println("Anda memilih hapus data Pasien");
                    scanner = new Scanner(System.in);
                    System.out.println("Masukkan Id Pasien yang akan dihapus :");
                    Id_Pasien = scanner.nextLine();
                    int hasil = execPsn.deletePas(Id_Pasien);
                    System.out.println("Data terhapus = "+ hasil);
                    break;
                }
                case 5 :{
                    System.out.println("Anda memilih Tampil Dokter ");
                    List<Dokter> listDok = execDok.getDok();
                    System.out.println("===========================================");
                    for(Dokter dok : listDok){
                        System.out.println(dok.toString());      
                    }
                    System.out.println("===========================================");
                    break;
                }
                case 6 :{
                    System.out.println("Anda memilih Input Data Dokter baru ");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Dokter    : ");
                    Id_Dokter = scanner.nextLine();
                    System.out.print("Masukkan Nama         : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Spesialis    : ");
                    Spesialis = scanner.nextLine();
                    System.out.print("Masukkan Umur         : ");
                    Umur = scanner.nextInt();
                    System.out.print("");
                    Bantu = scanner.nextLine();
                    System.out.print("Masukkan Alamat       : ");
                    Alamat = scanner.nextLine();
                    System.out.println("============================================");
                    Dokter newDok = new Dokter(Id_Dokter, Nama,Spesialis,Umur,Alamat);
                    int hasil = execDok.insertDok(newDok);
                    System.out.println("Data tersimpan = " + hasil);
                    break;
                }
                case 7 :{
                    System.out.println("Anda memilih Ubah data Dokter");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Dokter yang akan diubah : ");
                    Id_Dokter = scanner.nextLine();
                    System.out.print("Masukkan nama baru                  : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan spesialis baru             : ");
                    Spesialis = scanner.nextLine();
                    System.out.print("Masukkan umur baru                  :");
                    Umur = scanner.nextInt();
                    System.out.print("");
                    Bantu = scanner.nextLine();
                    System.out.print("Masukkan alamat baru                : ");
                    Alamat = scanner.nextLine();
                    Dokter newDok = new Dokter(Id_Dokter, Nama, Spesialis, Umur,Alamat);
                    int hasil = execDok.updateDok(newDok);
                    System.out.println("Data diubah = "+ hasil);
                    break;
                }
                 case 8 :{
                    System.out.println("Anda memilih hapus data Dokter");
                    scanner = new Scanner(System.in);
                    System.out.println("Masukkan Id Dokter yang akan dihapus :");
                    Id_Dokter = scanner.nextLine();
                    int hasil = execDok.deleteDok(Id_Dokter);
                    System.out.println("Data terhapus = "+ hasil);
                    break;
                }
                case 9 :{
                    System.out.println("Anda memilih Tampil Admin ");
                    List<Admin> listAdm = execAdm.getAdm();
                    System.out.println("===========================================");
                    for(Admin adm : listAdm){
                        System.out.println(adm.toString());      
                    }
                    System.out.println("===========================================");
                    break;
                }
                case 10 :{
                    System.out.println("Anda memilih Input Data Admin baru ");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Admin     : ");
                    Id_Admin = scanner.nextLine();
                    System.out.print("Masukkan Nama         : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Hp     : ");
                    No_Hp = scanner.nextLine();
                    System.out.print("Masukkan Alamat       : ");
                    Alamat = scanner.nextLine();
                    System.out.println("============================================");
                    Admin newAdm = new Admin(Id_Admin, Nama,No_Hp,Alamat);
                    int hasil = execAdm.insertAdm(newAdm);
                    System.out.println("Data tersimpan = " + hasil);
                    break;
                }
                case 11 :{
                    System.out.println("Anda memilih Ubah data Admin");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Admin  yang akan diubah : ");
                    Id_Admin = scanner.nextLine();
                    System.out.print("Masukkan nama baru                  : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Hp baru              : ");
                    No_Hp = scanner.nextLine();
                    System.out.print("Masukkan alamat baru                : ");
                    Alamat = scanner.nextLine();
                    Admin newAdm = new Admin(Id_Admin, Nama, No_Hp,Alamat);
                    int hasil = execAdm.updateAdm(newAdm);
                    System.out.println("Data diubah = "+ hasil);
                    break;
                }
                 case 12 :{
                    System.out.println("Anda memilih hapus data Admin");
                    scanner = new Scanner(System.in);
                    System.out.println("Masukkan Id Admin yang akan dihapus :");
                    Id_Admin = scanner.nextLine();
                    int hasil = execAdm.deleteAdm(Id_Admin);
                    System.out.println("Data terhapus = "+ hasil);
                    break;
                }
                case 13 :{
                    System.out.println("Anda memilih Tampil Layanan ");
                    List<Layanan> listLay = execLay.getLay();
                    System.out.println("===========================================");
                    for(Layanan lay : listLay){
                        System.out.println(lay.toString());      
                    }
                    System.out.println("===========================================");
                    break;
                }
                case 14 :{
                    System.out.println("Anda memilih Input Data Layanan baru ");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Layanan     : ");
                    Id_Layanan = scanner.nextLine();
                    System.out.print("Masukkan Id Admin(anda) : ");
                    Id_Admin = scanner.nextLine();
                    System.out.print("Masukkan Id Pasien      : ");
                    Id_Pasien = scanner.nextLine();
                    System.out.print("Masukkan Id Dokter      : ");
                    Id_Dokter = scanner.nextLine();
                    System.out.println("============================================");
                    Layanan newLay = new Layanan(Id_Layanan, Id_Admin,Id_Pasien,Id_Dokter);
                    int hasil = execLay.insertLay(newLay);
                    System.out.println("Data tersimpan = " + hasil);
                    break;
                }
                case 15 :{
                    System.out.println("Anda memilih Ubah data Layanan");
                    scanner = new Scanner(System.in);
                    System.out.print("Masukkan Id Layanan yang akan diubah : ");
                    Id_Layanan = scanner.nextLine();
                    System.out.print("Masukkan id admin baru               : ");
                    Id_Admin = scanner.nextLine();
                    System.out.print("Masukkan id pasien yang baru         : ");
                    Id_Pasien = scanner.nextLine();
                    System.out.print("Masukkan id dokter yang baru         : ");
                    Id_Dokter = scanner.nextLine();
                    Layanan newLay = new Layanan(Id_Layanan, Id_Admin, Id_Pasien,Id_Dokter);
                    int hasil = execLay.updateLay(newLay);
                    System.out.println("Data diubah = "+ hasil);
                    break;
                }
                 case 16 :{
                    System.out.println("Anda memilih hapus data Layanan");
                    scanner = new Scanner(System.in);
                    System.out.println("Masukkan Id Layanan yang akan dihapus :");
                    Id_Layanan = scanner.nextLine();
                    int hasil = execLay.deleteLay(Id_Layanan);
                    System.out.println("Data terhapus = "+ hasil);
                    break;
                }
                case 17 :{
                    System.out.println("Anda berhasil log off dari Aplikasi!!!");
                    KELUAR = true;
                    break;
                }
            }
        }
    }
}

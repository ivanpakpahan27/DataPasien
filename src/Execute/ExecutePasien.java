package Execute;
import java.util.List;
import java.util.Scanner;
import Entitas.Pasien;
/**
 *
 * @author Ivan Pakpahan
 */
public class ExecutePasien {
    private static boolean KELUAR = false;
    private static ExecutePsn execPsn;
    public static void main(String[] args) {
        execPsn = new ExecutePsn();
        String Id_Pasien, Nama, Alamat;
        int Umur;
        while(!KELUAR){
            System.out.println("**********************************************");
            System.out.println("*1. Tampil data pasien  ");
            System.out.println("*2. Input data pasien  ");
            System.out.println("*3. Ubah data pasien  ");
            System.out.println("*4. Hapus data pasien ");
            System.out.println("*5. Keluar Aplikasi ");
            System.out.println("**********************************************");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan pilihan Anda : ");
            int pilih = scanner.nextInt();
            switch(pilih){
                case 1 :{
                    System.out.println("Anda memilih Tampil Data ");
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
                    System.out.print("Masukkan Id Pasien                 : ");
                    Id_Pasien = scanner.nextLine();
                    System.out.print("Masukkan Nama                      : ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat                    : ");
                    Alamat = scanner.nextLine();
                    System.out.print("Masukkan Umur                      : ");
                    Umur = scanner.nextInt();
                    System.out.print("Masukkan Status                    : ");
                    String Status = scanner.nextLine();
                    Pasien newPas = new Pasien(Id_Pasien, Nama,Umur,Alamat,Status);
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
                    System.out.print("Masukkan status baru                :");
                    String Status = scanner.nextLine();
                    Pasien newPas = new Pasien(Id_Pasien, Nama, Umur, Alamat,Status);
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
                    System.out.println("Anda keluar Aplikasi!!!");
                    KELUAR = true;
                    break;
                }
            }
        }
    }
}

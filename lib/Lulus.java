import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan Nilai Mahasiswa: ");
        double nilaiMahasiswa = input.nextDouble();

        String Keterangan;
        if(nilaiMahasiswa >=75) {
            Keterangan = "Lulus";
        } else {
            Keterangan = "Tidak Lulus";
        }
        
        System.out.println("Keterangan: " + Keterangan);

        input.close();
    }
    
}

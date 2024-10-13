import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        String Grade;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai mahasiswa: ");
        double nilaiAkhir = input.nextDouble();

        if(nilaiAkhir >=85) {
            Grade = "A";
        } else if(nilaiAkhir >=75) {
            Grade = "B";
        } else if(nilaiAkhir >=65) {
            Grade = "C";
        } else if(nilaiAkhir >=55) {
            Grade = "D";
        } else {
            Grade = "E";
        }

        System.out.println("Nilai Anda :" + nilaiAkhir);
        System.out.println("Grade Anda :" + Grade);

        input.close();
    }
    
}

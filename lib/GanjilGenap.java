import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int Angka = input.nextInt();

        if(Angka % 2 == 0) {
            System.out.println(Angka + "Adalah Bilangan Genap.");
        } else {
            System.out.println(Angka + "Adalah Bilangan Ganjil.");
        }

        input.close();
    }

    
}

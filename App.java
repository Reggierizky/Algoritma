import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);

        //warung 
        System.out.println("harga telur perkg");
        Double HargaPerkg = inputan.nextDouble();

        System.out.println("berapa kg yang dibeli dan berapa uang yang dikasih pembeli");
        Double Kgtelur = inputan.nextDouble();
        Double UangMasuk = inputan.nextDouble();
        Double Uangkembalian = UangMasuk - (HargaPerkg * Kgtelur);
       
        System.out.println("jadi uang kembaliannya:" + Uangkembalian);
;        

        //merubah celcius ke fahrenheit
        System.out.println("masukan celcius");
        Double celcius = inputan.nextDouble();
        Double fahrenheit = (celcius*9/5)+32;
        System.out.println("suhu dalam fahrenheit: " +fahrenheit);


        //keliling lingkaran
        System.out.println ( "masukan jari jari lingkaran");
        Double jarijari = inputan.nextDouble();
        Double kelilingLingkaran = 2 * Math.PI *jarijari;
        System.out.println("keliling lingkaran adalah:" +kelilingLingkaran);
        
        
        //Luas persegi panjang
        System.out.println( "masukan nilai panjang dan lebar");
        Double panjang = inputan.nextDouble();
        Double lebar = inputan.nextDouble();
        Double luas = panjang * lebar;
        System.out.println("Luasnya adalah:" + luas);


        // Volume kubus
        System.out.println( "masukan panjang sisi");
        Double sisi = inputan.nextDouble();
        Double volume = sisi * sisi * sisi;
        System.out.println("volume dari kubus tersebut adalah:" + volume);


        //Persegi
        System.out.println("kamu adalah");
        Double Sisi = inputan.nextDouble();
        Double Luas = Sisi * Sisi;
        System.out.println("jadi hasilnya" +Luas);


        inputan.close();

    
    }
}
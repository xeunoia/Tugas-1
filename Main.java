import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String nama, nama_barang;
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.println("Stock Gudang Input Barang");
        System.out.println("#########################");
        System.out.println("Selamat Datang" + " " + nama);
        System.out.print("Masukkan nama barang yang mau ditambah : ");
        nama_barang = input.nextLine();
        int jumlah_barang;
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        jumlah_barang = input.nextInt();
        Double harga_beli, harga_jual;
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        harga_beli = input.nextDouble();
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        harga_jual = input.nextDouble();
        System.out.println("Stock Gudang Rincian Barang");
        System.out.println("###########################");
        System.out.println("Nama Barang" + " " + nama_barang);
        System.out.println("Jumlah Barang" + " " + jumlah_barang);


        double b = harga_beli;
        double j = harga_jual;
        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println("Harga Beli : Rp. " + (df.format(b)));
        System.out.println("Harga Jual : Rp. " + (df.format(j)));

    }
}
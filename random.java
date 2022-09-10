import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class random{
    public static void main(String[] args) {
        String nama, nama_pasangan;
        int umur, umur_pasangan;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("**************************************");
        System.out.println();

        System.out.println("Data Anda");
        System.out.println("***********");
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        umur = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Data Pasangan Anda");
        System.out.println("*******************");
        System.out.print("Masukkan Nama Pasangan Anda : ");
        nama_pasangan = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda : ");
        umur_pasangan = input.nextInt();
        System.out.println();

        System.out.println(nama + " [" + umur + "] Tahun");
        System.out.println();

        final int size = 3  ;

        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print('♥');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("♥");
            }
            System.out.print(System.lineSeparator());
        }

        System.out.println();
        System.out.println(nama_pasangan + " [" + umur_pasangan + "] Tahun");
        System.out.println();
        DecimalFormat df = new DecimalFormat("#.##");
        double value = random.nextDouble() * 100;
        while (value >= 50) ;
        value = random.nextDouble() * 100;

        System.out.println("Kecocokan Anda dengan Pasangan anda adalah : " +(df.format(random.nextDouble(100))) + " %");
        System.out.println("Terima Kasih telah menggunakan aplikasi kami");
        input.close();
    }

    private static double nextDouble() {
        return 0;
    }
}

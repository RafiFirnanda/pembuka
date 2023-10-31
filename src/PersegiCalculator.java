import java.util.Scanner;

/**
 * Program PersegiCalculator adalah program sederhana untuk menghitung luas dan keliling persegi.
 */
public class PersegiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi;

        System.out.println("selamat datang");
        // Menampilkan pesan sambutan kepada pengguna
        System.out.println("Program Hitung Luas dan Keliling Persegi");

        // Meminta pengguna untuk memasukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextDouble();

        // Menghitung luas persegi
        double luas = sisi * sisi;

        // Menghitung keliling persegi
        double keliling = 4 * sisi;

        // Menampilkan hasil luas persegi ke layar
        System.out.println("Luas persegi: " + luas);

        // Menampilkan hasil keliling persegi ke layar
        System.out.println("Keliling persegi: " + keliling);
    }
}

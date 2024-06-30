package HitungVolumeBalok;

import java.util.Scanner;

/**
 *
 * @author Komang Agus Anjas Putra
 * NIM     : 2201010760
 * Tanggal : 26 Juni 2024
 */
public class HitungVolumeBalok {
    /**
     * @param args the command line arguments
     */
    private double panjang, lebar, tinggi;

    public HitungVolumeBalok() {
        // Constructor tanpa parameter
    }

    public HitungVolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void setPj(double panjang) {
        this.panjang = panjang;
    }

    public void setLb(double lebar) {
        this.lebar = lebar;
    }

    public void setTg(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void printHasil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        HitungVolumeBalok balok = new HitungVolumeBalok(panjang, lebar, tinggi);
        balok.printHasil();
    }
}

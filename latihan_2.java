import java.util.Scanner;
import java.lang.Math;

public class latihan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih Bangun Datar: ");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan alas: ");
                    int alas = input.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = input.nextInt();

                    Segitiga obj = new Segitiga(alas, tinggi);
                    System.out.println("\nHasil luas: " + obj.hasilLuas());
                    System.out.println("Hasil keliling: " + obj.hasilKeliling());
                    break;
                }

                case 2: {
                    System.out.print("Masukkan panjang: ");
                    int panjang = input.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = input.nextInt();

                    Persegi obj = new Persegi(panjang, lebar);
                    System.out.println("\nHasil luas: " + obj.hasilLuas());
                    System.out.println("Hasil keliling: " + obj.hasilKeliling());
                    break;
                }

                case 3: {
                    System.out.print("Masukkan jari-jari: ");
                    int jarijari = input.nextInt();

                    Lingkaran obj = new Lingkaran(jarijari);
                    System.out.println("\nHasil luas: " + obj.hasilLuas());
                    System.out.println("Hasil keliling: " + obj.hasilKeliling());
                    break;
                }

                case 0:
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}

class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hasilLuas() {
        return 0.5 * alas * tinggi;
    }

    double hasilKeliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}

class Persegi {
    int panjang;
    int lebar;

    Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hasilLuas() {
        return panjang * lebar;
    }

    double hasilKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran {
    int jarijari;

    Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }

    double hasilLuas() {
        return Math.PI * jarijari * jarijari;
    }

    double hasilKeliling() {
        return 2 * Math.PI * jarijari;
    }
}

import java.util.Scanner;
import java.lang.Math;

public class tugas28okt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\n\nPilih opsi menghitung luas:\n1. Persegi\n2. Persegi panjang\n3. Segitiga\n4. Lingkaran\n");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1: {
                    System.out.print("Masukan Panjang: ");
                    int s=input.nextInt();
                    System.out.printf("\nhasil: %.2f", Persegi(s)); 
                    break;
                }
                case 2: {
                    System.out.print("Masukan Panjang: ");
                    int p=input.nextInt();
                    System.out.print("Masukan Lebar: ");
                    int l=input.nextInt();
                    System.out.printf("\nhasil: %.2f", PersegiPanjang(p, l));
                    break;
                }
                case 3: {
                    Segitiga(input); 
                    break;
                }
                case 4: {
                    Lingkaran(input); 
                    break;
                }
            
                default: {
                    System.out.println("Opsi tidak tersedia");
                    break;
                }
            }

            System.out.println("\n\nApakah anda ingin lanjut: \n1. YA\n2. TIDAK\n");
            pilihan = input.nextInt();
            if (pilihan == 1) lanjut = true;
            else lanjut = false;
        }
        
    }
    public static double Persegi(double s) {
        double hasil = s*s;
        return hasil;
    }

    public static double PersegiPanjang(double p, double l) {
        double hasil = p*l;
        return hasil;
    }

    public static void Lingkaran(Scanner input) {
        System.out.print("Masukan Radius: ");
        int r=input.nextInt();
        double hasil = r*r*Math.PI;
        System.out.printf("\nhasil: %.2f", hasil);
    }

    public static void Segitiga(Scanner input) {
        System.out.print("Masukan Alas: ");
        int a=input.nextInt();
        System.out.print("Masukan Tinggi: ");
        int t=input.nextInt();
        double hasil = (a*t) / 2;
        System.out.printf("\nhasil: %.2f", hasil);
    }


} 

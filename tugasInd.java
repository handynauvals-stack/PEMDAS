import java.util.Scanner;

public class tugasInd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            double massa, kecepatan, ketinggian, energiPotensial, energiKinetik, energiMekanik;
            int gravitasi = 10;

            System.out.println("===================================");
            System.out.print("Masukan massa \t: ");
            massa = input.nextDouble();
            System.out.print("Masukan kecepatan \t: ");
            kecepatan = input.nextDouble();
            System.out.print("Masukan ketinggian \t: ");
            ketinggian = input.nextDouble();
            System.out.println("===================================\nHasil:\n");

            energiPotensial = massa * gravitasi * ketinggian;
            energiKinetik = 0.5 * massa * (kecepatan*kecepatan);
            energiMekanik = energiKinetik + energiPotensial;

            System.out.println("Energi Potensial: "+energiPotensial+"\nEnergi Kinetik \t: "+energiKinetik+"\nEnergi Mekanik \t: "+energiMekanik);
            System.out.println("===================================\n\n\n");
        }
    }
    
}
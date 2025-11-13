import java.util.Scanner;

public class CariMenuKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        int hasil = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(cari)) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != -1) {
            System.out.println("Menu " + cari + " tersedia, merupakan menu ke-" + (hasil + 1));
        } else {
            System.out.println("Menu " + cari + " tidak tersedia di daftar menu.");
        }
    }
}

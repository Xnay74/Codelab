import java.util.Scanner;

public class maincodemod2 {


        public static void main(String[] args) {
            codelab1Modul2 data = new codelab1Modul2();
            Scanner input = new Scanner(System.in);
            System.out.println(data.tampilUniversitas());
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Tambah data mahasiswa");
                System.out.println("2. Tampilkan data mahasiswa");
                System.out.println("3. Keluar");
                System.out.println("Pilih menu (1-3): ");

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        data.tampilDataMahasiswa();
                        break;
                    case 2:
                        data.displayDataMahasiswa();
                        break;
                    case 3:
                        System.out.println("さようなら \nSayonara");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }

            } while (choice != 3);
        }


}

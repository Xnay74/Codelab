package Pengumpulan;

import java.util.Scanner ;
import java.time.LocalDate;
import java.time.Period ;

public class Codelab1modul1 {
    public static void main(String[] args) {
        Scanner kata = new Scanner(System.in);

        System.out.print("Nama :");
        String Nama = kata.nextLine();

        System.out.print("Jenis kelamin (L\\P) :");
        char Jeniskelamin = kata.next().charAt(0);

        System.out.print("Tanggal Lahir (yyyy-mm-dd) :");
        String TanggalLahirStr = kata.next();

        LocalDate TanggalLahir = LocalDate.parse(TanggalLahirStr);

        LocalDate Sekarang = LocalDate.now();
        Period Umur = Period.between(TanggalLahir, Sekarang);

        System.out.println(STR."\nNama : \{Nama}");
        System.out.println("Jenis Kelamin :" + (Jeniskelamin == 'L' ? "Laki-laki" : "perempuan"));
        System.out.println("Umur :" + Umur.getYears() + " Tahun " + Umur.getMonths() + " Bulan " + Umur.getDays() + " hari ");

    }
}

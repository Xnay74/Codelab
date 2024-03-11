package Pengumpulan;

import java.util.Scanner;

    public class tes {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("masukan angka pertama:");
            int angka1 = scanner.nextInt();
            System.out.print("masukan angka kedua:");
            int angka2 = scanner.nextInt();
            int hasil = angka1 + angka2;

            System.out.println(STR."hasil dari \{angka1} + \{angka2} adalah:\{hasil}");
            //System.out.println("hasil dari " + angka1 + " + " + angka2 + " adalah: " + hasil);

            scanner.close();
        }

    }



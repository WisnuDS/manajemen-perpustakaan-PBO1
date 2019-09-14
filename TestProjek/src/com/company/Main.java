package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Bangun datan yang ingin dihitung\n" +
                "1. Segitiga\n" +
                "2. Persegi Panjang\n" +
                "3. Lingkaran");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.print("Masukan Alas : ");
            int alas = input.nextInt();
            System.out.print("Masukan Tinggi : ");
            int tinggi = input.nextInt();
            double luas = luasSegitiga(alas,tinggi);
            System.out.println("Luas Segitiga Adalah : "+luas);
        }
        else if (pilihan == 2) {
            System.out.print("Masukan Panjang : ");
            int panjang = input.nextInt();
            System.out.print("Masukan Lebar : ");
            int lebar = input.nextInt();
            double luas = luasPersegiPanjang(panjang,lebar);
            System.out.println("Luas Persegi Panjang Adalah : "+luas);
        }
        else {
            System.out.print("Masukan Jari-jari : ");
            int jari = input.nextInt();
            double luas = luasLingkaran(jari);
            System.out.println("Luas Lingkaran Adalah : "+luas);
        }
    }

    private static double luasLingkaran(float jari) {
        return Math.PI*jari*jari;
    }

    private static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang*lebar;
    }

    private static double luasSegitiga(int alas, int tinggi) {
        return alas*tinggi*0.5;
    }
}

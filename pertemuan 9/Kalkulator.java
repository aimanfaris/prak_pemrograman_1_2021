import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Masukkan nilai a = ");
        int nilaiA = scan.nextInt();
        System.out.print("Masukkan nilai b = ");
        int nilaiB = scan.nextInt();
        
        int hasil1 = penjumlahan(nilaiA, nilaiB);
        System.out.println("Nilai A + B = " + hasil1);
        int hasil2 = pengurangan(nilaiA, nilaiB);
        System.out.println("Nilai A - B = " + hasil2);
        int hasil3 = perkalian(nilaiA, nilaiB);
        System.out.println("Nilai A * B = " + hasil3);
        int hasil4 = pembagian(nilaiA, nilaiB);
        System.out.println("Nilai A / B = " + hasil4);
        int hasil5 = sisahasilbagi(nilaiA, nilaiB);
        System.out.println("Nilai A % B = " + hasil5);

        scan.close();
    }

    public static int penjumlahan(int nilaiA, int nilaiB) {
        int hasil1 = nilaiA + nilaiB;
        return hasil1;
    }

    public static int pengurangan(int nilaiA, int nilaiB) {
        int hasil2 = nilaiA - nilaiB;
        return hasil2;
    }

    public static int perkalian(int nilaiA, int nilaiB) {
        int hasil3 = nilaiA * nilaiB;
        return hasil3;
    }
    
    public static int pembagian(int nilaiA, int nilaiB) {
        int hasil4 = nilaiA / nilaiB;
        return hasil4;
    }

    public static int sisahasilbagi(int nilaiA, int nilaiB) {
        int hasil5 = nilaiA % nilaiB;
        return hasil5;
    }
}


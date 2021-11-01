import java.util.Scanner;

public class TanpaArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama = ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua = ");
        int angka2 = scanner.nextInt();
        System.out.print("Masukkan angka ketiga = ");
        int angka3 = scanner.nextInt();
        System.out.print("Masukkan angka keempat = ");
        int angka4 = scanner.nextInt();
        System.out.print("Masukkan angka kelima = ");
        int angka5 = scanner.nextInt();

        int jumlah = angka1 + angka2 + angka3 + angka4 + angka5;
        System.out.println("Jumlah angka yang anda masukan adalah = " + jumlah);
    }
}
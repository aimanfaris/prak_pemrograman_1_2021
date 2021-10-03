import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nDepan, nBelakang, nim, pStudi, fakultas;
        double ipk;
        int tahunMasuk, tahunLulus;

        System.out.print("Masukan nama depan Anda = ");
        nDepan=scan.nextLine();
        System.out.print("Masukan nama belakang Anda = ");
        nBelakang=scan.nextLine();
        System.out.print("Masukan nim Anda = ");
        nim=scan.nextLine();
        System.out.print("Masukan program studi Anda = ");
        pStudi=scan.nextLine();
        System.out.print("Masukan fakultas Anda = ");
        fakultas=scan.nextLine();
        System.out.print("Masukan ipk Anda = ");
        ipk=scan.nextDouble();
        System.out.print("Masukan tahun masuk Anda = ");
        tahunMasuk=scan.nextInt();
        System.out.print("Masukan tahun lulus Anda = ");
        tahunLulus=scan.nextInt();

        System.out.println("Nama Lengkap = " + nDepan + nBelakang);
        System.out.println("NIM = " + nim);
        System.out.println("Program Studi = " + pStudi);
        System.out.println("Fakultas = " + fakultas);
        System.out.println("IPK =" + ipk);
        
        int lamaStudi = tahunLulus - tahunMasuk + 1;
        if (ipk >= 3.51 && ipk <= 4 && lamaStudi <= 4) {
            System.out.println("Predikat Lulus = Dengan Pujian (Summa CumLaude)");
        } else if (ipk >= 3.51 && ipk <= 4) {
            System.out.println("Predikat Lulus = Dengan Pujian (CumLaude)");
        } else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Predikat Lulus = Sangat Memuaskan");
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Predikat Lulus = Memuaskan");
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Predikat Lulus = Cukup");
        } else if (ipk < 2.00) {
            System.out.println("Predikat Lulus = Tidak Lulus");
        } else if (ipk > 4 || ipk < 0) {
            System.out.println("Predikat Lulus = Tidak Valid");
        }
    }
}



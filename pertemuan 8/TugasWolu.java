import java.util.Scanner;

public class TugasWolu {
    public static void main(String[] args) {
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        String[] akhir = {"exit", "Exit"};
        int i;
        double jumlah= 0;

        System.out.println();
        System.out.println("KETIK exit/Exit Pada Menu (Masukan Nama Mahasiswa) Untuk Melihat Data ");
        System.out.println();

        for (i = 1; i<1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i + " = ");
            System.out.print("Masukan Nama Mahasiswa = ");
            String inputNama = scan.nextLine();
            if (inputNama.equals(akhir[0]) || (inputNama.equals(akhir[1]))) {
                break;
            } else {
                nama[i] = inputNama;
            }
            System.out.print("Masukan IPK Mahasiswa = ");
            double ipkMhs = scan.nextDouble();
            ipk[i] = ipkMhs;
            System.out.println();
           jumlah =jumlah + ipk[i];
        }

        System.out.println("No"+"\t"+"Nama"+"\t\t\t\t"+"IPK");
        System.out.println("---------------------------------------------------");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "\t" + nama[j] + "\t\t\t\t" + ipk[j]);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("\t"+ "Rata-rata IPK " + "\t\t\t" +jumlah / (i - 1));
    }
}




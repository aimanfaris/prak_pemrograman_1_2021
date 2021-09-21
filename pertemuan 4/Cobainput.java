import java.util.Scanner;

public class Cobainput {
    public static void main(String[] args) {
        System.out.println("Ini adalah program ");
        System.out.println("saya");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan nama anda : ");
        String namaDepan = scanner.nextLine();

        System.out.println("Masukan umur anda : ");
        int umur = scanner.nextInt();

        System.out.println("Nama anda adalah " + namaDepan);
        System.out.println("Umur anda adalah " + umur);

    }
    
}

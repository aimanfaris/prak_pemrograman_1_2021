import java.util.Scanner;

public class BelajarElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan umur anda = ");
        int umur = scanner.nextInt();
        if (umur <= 5 && umur >= 0) {
            System.out.println("Anda masih balita");
        } else if (umur > 5 && umur <= 19) {
            System.out.println("Anda sudah Remaja");
        } else if (umur > 19 && umur <=39) {
            System.out.println("Anda sudah Dewasa");
        } else if (umur > 40 && umur <= 100) {
            System.out.println("Anda sudah tua");
        } else {
            System.out.println("Umur anda tidak valid");
        }
    }
}

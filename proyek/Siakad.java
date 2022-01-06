/* 
Nama = Muhammad Faris Aiman
NIM  = 21537144033
Prodi= Teknologi Informasi
Kelas= J2
*/


import java.util.Scanner;
public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=12) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariDataByNIM();
            } else if (menu==4) {
                siakad.cariDataByNama();
            } else if (menu==5) {
                siakad.rerataIPK();
            } else if (menu==6) {
                siakad.editNama();
            } else if (menu==7) {
                siakad.editIpk();
            } else if (menu==8) {
                siakad.editSem();
            } else if (menu==9) {
                siakad.editProdi();
            } else if (menu==10) {
                siakad.editTinggiBadan();
            } else if (menu==11) {
                siakad.hapusData();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("|SELAMAT DATANG PADA PUSAT INFORMASI MAHASISWA UNY|");
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|-------MENU-------|");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data dengan NIM");
        System.out.println("4. Cari data dengan Nama");
        System.out.println("5. Rerata IPK");
        System.out.println("6. Edit Nama");
        System.out.println("7. Edit IPK");
        System.out.println("8. Edit Semester");
        System.out.println("9. Edit Prodi");
        System.out.println("10. Edit Tinggi Badan");
        System.out.println("11. Hapus Data");
        System.out.println("12. Keluar");
        System.out.println("");
        System.out.print("Silahkan pilih menu anda = ");
        int menu = scan.nextInt();
        return menu;
        
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("");
            System.out.println("Belum ada data");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("|Berikut data mahasiswa|");
            System.out.println("------------------------");
            System.out.println("");
            for (int i=0; i<jumlahData;i++) {
                mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan program studi anda = ");
        String prodi = scan.nextLine();
        System.out.print("Masukan dosen pembibing anda = ");
        String dosen = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan mahasiswa dalam cm = ");
        double tinggi = scan.nextDouble();
        System.out.print("Masukan berat Badan mahasiswa dalam kg = ");
        double berat = scan.nextDouble(); 
        System.out.print("Masukan Semester Anda Sekarang = ");
        int sem = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, dosen, ipk, sem, prodi);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        System.out.print("");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda cari tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    public void cariDataByNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama mahasiswa yang akan dicari = ");
        System.out.print("");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index==-1) {
            System.out.println("");
            System.out.println("Nama yang anda cari tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            mahasiswa[index].getDetail();
        }
    }

    public void editProdi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Program Studi yang baru = ");
            String prodi = scan.nextLine();
            mahasiswa[index].setProdi(prodi);
            mahasiswa[index].getDetail();
        }
    }

    public void editTinggiBadan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Tinggi Badan yang baru = ");
            Double tinggi = scan.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggi);
            mahasiswa[index].getDetail();
        }
    }

    public void editIpk() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Ipk mahasiswa yang baru = ");
            Double ipk = scan.nextDouble();
            mahasiswa[index].setIPK(ipk);
            mahasiswa[index].getDetail();
        }
    }

    public void editSem() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Semester mahasiswa yang baru = ");
            int sem = scan.nextInt();
            mahasiswa[index].setSem(sem);
            mahasiswa[index].getDetail();
        }
    }
    
    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("");
            System.out.println("Data yang anda akan hapus tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            int lan = 0;
            lan = lanjutan();
            if (lan==1) {
                for (int i = index; i<jumlahData; i++) {
                    mahasiswa[i] = mahasiswa[i+1]; 
                }
                jumlahData--;
                lihatData();
            }
        }
    }

    private static int lanjutan() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Apakah anda yakin ingin menghapus data ? ");
        System.out.println("1. Yakin");
        System.out.println("2. Batal");
        System.out.println("Masukan pilihanmu ");
        int lan = scan.nextInt();
        return lan;
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    
}


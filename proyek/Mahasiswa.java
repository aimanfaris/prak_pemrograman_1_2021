public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private String dosen;
    private int sem;

    public Mahasiswa(String nim, String nama,String dosen, double ipk, int sem) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.sem = sem;
        this.dosen = dosen;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getDosen() {
        return this.dosen;
    
    }
    
    public void setIPK(double ipk) {
        this.ipk = ipk;
    
    }

    public double getIPK() {
        return this.ipk;

    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public double getSem() {
        return this.sem;
    
    }
    public void getDetail() {
        System.out.println("NIM anda adalah = " + this.nim);
        System.out.println("Nama anda adalah = " + this.nama);
        System.out.println("Dosen pembimbing anda adalah = " + this.dosen);
        System.out.println("IPK anda adalah = " + this.ipk);
        System.out.println("Tinggi badan anda adalah = " + this.tinggiBadan +" cm ");
        System.out.println("Berat badan anda adalah = " + this.beratBadan + " kg "); 
        System.out.println("Semester anda saat ini adalah = " + this.sem);
        System.out.println("-----------------------------------");
    }

}
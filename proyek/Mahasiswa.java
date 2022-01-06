public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private String dosen;
    private int sem;
    private String prodi;

    public Mahasiswa(String nim, String nama,String dosen, double ipk, int sem, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.sem = sem;
        this.dosen = dosen;
        this.prodi = prodi;
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
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return this.prodi;
    }
    public void getDetail() {
        System.out.println("1. NIM = " + this.nim);
        System.out.println("2. Nama = " + this.nama.toUpperCase());
        System.out.println("3. Program Studi = " + this.prodi);
        System.out.println("4. Dosen pembimbing = " + this.dosen.toUpperCase());
        System.out.println("5. IPK = " + this.ipk);
        System.out.println("6. Tinggi badan = " + this.tinggiBadan + " cm ");
        System.out.println("7. Berat badan = " + this.beratBadan + " kg "); 
        System.out.println("8. Semester = " + this.sem);
        System.out.println("-----------------------------------");
    }

}
  import java.util.Scanner;
public class latihan1{
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 || jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 || jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    public void cetakNota() {
        System.out.println("Code            : " + kode);
        System.out.println("Name            : " + nama);
        System.out.println("Cost           : " + harga);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Total Pembelian : " + getTotalPembelian());
        System.out.println("Bonus           : " + getBonus());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    latihan1 penjualan = new latihan1();
        String inputLagi;
        do {
            System.out.print("Masukkan kode   : ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan nama anda   : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan harga yang dipilih  : ");
            float harga = scanner.nextFloat();
            System.out.print("Masukkan jumlahnya12 : ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();

            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("Input data lagi [Y/T]? ");
            inputLagi = scanner.nextLine();
        } while (inputLagi.equalsIgnoreCase("Y"));
    }
}
    

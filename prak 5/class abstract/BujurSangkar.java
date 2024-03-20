public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    } 
    // Jika BangunDatar tidak diimplementasikan maka method hitungLuas tidak dapat dijalankan
    // karena method hitungLuas mewarisi luas dari class abstract BangunDatar
}

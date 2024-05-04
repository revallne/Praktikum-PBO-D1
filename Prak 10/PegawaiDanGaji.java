public class PegawaiDanGaji {
    public static class Pegawai {
        protected String nama;
        protected int gajiPokok = 5000000;
    
        public Pegawai(String nama) {
            this.nama = nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void tampilData() {
            System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
        }
    }

    public static class Manajer extends Pegawai{
        private int tunjangan = 700000;

        public Manajer(String nama) {
            super(nama);
        }

        public void tampilData() {
            super.tampilData();
            System.out.println("Tunjangan: " + tunjangan);
        }
    }

    public static class Programmer extends Pegawai{
        private int bonus = 450000;

        public Programmer(String nama) {
            super(nama);
        }

        public void tampilData() {
            super.tampilData();
            System.out.println("Bonus: " + bonus);
        }
    }

    public static class Payroll{
        public void cetakGaji(Pegawai pegawai){
            pegawai.tampilData();
        }
    }

    public static void main(String args[]) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");
        Payroll payroll = new Payroll();

        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
    
}



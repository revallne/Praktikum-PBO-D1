public class Prak11b {
    public static class Kupu {
        void gerak() {
        }
    }
    
    public static class Ulat extends Kupu {
        void gerak() {
            System.out.println("Ulat merayap");
        }
    }
    
    public static class Kepompong extends Kupu {
        void gerak() {
            System.out.println("Kepompong diam");
        }
    }
    
    public static class KupuDewasa extends Kupu {
        void gerak() {
            System.out.println("Kupu-kupu terbang");
        }
    }
    
    public static class Data<T extends Kupu> {
        private T isi;
        
        T getIsi() {
            return isi;
        }
        
        void setIsi(T x) {
            this.isi = x;
        }
    }
    
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}

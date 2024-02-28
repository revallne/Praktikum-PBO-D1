
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getGradien(){
        return (titikAkhir.getOrdinat()-titikAwal.getOrdinat()) / (titikAkhir.getAbsis()-titikAwal.getAbsis());
    }

    public Garis getRefleksiY() {
        Titik refTAwal = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
        Titik refTAkhir = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        return new Garis(refTAwal, refTAkhir);
    }

    public boolean isTegakLurus(Garis g){
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        return Math.abs(gradien1 * gradien2) == -1;
    }
    
}

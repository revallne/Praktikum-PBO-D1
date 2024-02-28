public class MGaris {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(1, 2);
        Titik titikAkhir = new Titik(4, 6);

        Garis G1 = new Garis(titikAwal, titikAkhir);

        double x1 = G1.getTitikAwal().getAbsis();
        double y1 = G1.getTitikAwal().getOrdinat();

        double x2 = G1.getTitikAkhir().getAbsis();
        double y2 = G1.getTitikAkhir().getOrdinat();

        System.out.println("Garis G1 = (" + x1 + ", " + y1 + ") (" + x2 + ", " + y2 + ")");

        double panjangGaris = G1.getPanjang();
        System.out.println("Panjang G1 = " + panjangGaris);

        double gradien = G1.getGradien();
        System.out.println("Gradien G1 = " + gradien);

        Garis G2 = G1.getRefleksiY();
        System.out.println("Refleksi garis G1 terhadap sumbu Y: (" + G2.getTitikAwal().getAbsis() + ", " + G2.getTitikAwal().getOrdinat() + ")  (" +
                G2.getTitikAkhir().getAbsis() + ", " + G2.getTitikAkhir().getOrdinat() + ")");
        
        System.out.println("Apakah G1 tegak lurus dengan G2(refleksi)? " + G1.isTegakLurus(G2));

    }
    
}

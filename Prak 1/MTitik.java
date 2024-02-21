
public class MTitik {
    
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik();
        T1.setAbsis(1);
        T1.setOrdinat(1);
        T2.setAbsis(4);
        T2.setOrdinat(5);

        // Post Test
        Titik T3 = new Titik(5,6);

        System.out.println(("\nJumkah Objek titik: " + T2.getCounter()));
        System.out.println("\nT1(" + T1.getAbsis()+ ", " + T1.getOrdinat() + ")");
        System.out.println("\nT2(" + T2.getAbsis()+ ", " + T2.getOrdinat() + ")");   
        System.out.println("\nT3(" + T3.getAbsis()+ ", " + T3.getOrdinat() + ")");      
    }
}

        
